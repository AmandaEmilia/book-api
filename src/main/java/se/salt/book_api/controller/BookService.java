package se.salt.book_api.controller;

import io.micrometer.observation.ObservationFilter;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final List<Book> books;

    public BookService(BookRepository bookRepository) {
        this.books = bookRepository.findAll();
    }

    // 1. Hämta alla böcker
    public List<Book> getAllBooks() {
        return books;
    }

    // 2. Hämta bok via ID, annars kasta fel
    public Book getBookById(Long id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Book not found with id: " + id));
    }

    // 3. Lista alla unika författare
    public List<String> getAllAuthors() {
        return books.stream()
                .map(Book::getAuthor)
                .distinct()
                .sorted()
                .toList();
    }

    // 4. Hämta böcker av en viss författare
    public List<Book> getBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .toList();
    }

    // 5. Sortera böcker efter rating (högst först)
    public List<Book> getBooksSortedByRating() {
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getRating).reversed())
                .collect(Collectors.toList());
    }

    public Book updateBookRating(Long id, int newRating) {
        Book book = getBookById(id); // kastar NoSuchElementException om den inte finns
        book.setRating(newRating);   // uppdatera direkt i objektet
        return book;
    }
}

