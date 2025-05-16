package se.salt.book_api.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/books")
@CrossOrigin
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // 1. Lista alla böcker
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // 2. Hämta en bok via ID
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id); // kastar fel om boken inte finns
    }

    // 3. Lista alla författare
    @GetMapping("/authors")
    public List<String> getAllAuthors() {
        return bookService.getAllAuthors();
    }

    // 4. Hämta böcker av specifik författare
    @GetMapping("/by-author")
    public List<Book> getBooksByAuthor(@RequestParam String name) {
        return bookService.getBooksByAuthor(name);
    }

    // 5. Hämta böcker sorterade på rating
    @GetMapping("/sorted-by-rating")
    public List<Book> getBooksSortedByRating() {
        return bookService.getBooksSortedByRating();
    }

    @PatchMapping("/{id}/rating")
    public Book updateBookRating(@PathVariable Long id, @RequestBody int newRating) {
        return bookService.updateBookRating(id, newRating);
    }


    // 🔴 Felhantering – returnera 404 vid NoSuchElementException
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNotFound(NoSuchElementException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}

