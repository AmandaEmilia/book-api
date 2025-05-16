package se.salt.book_api.controller;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    public List<Book> findBooks() {
        List<Book> books = List.of(
                Book.builder()
                        .id(1L)
                        .title("Pride and Prejudice")
                        .author("Jane Austen")
                        .about("A romantic novel that explores manners, marriage, and morality in early 19th-century England.")
                        .rating(5)
                        .coverImg("https://covers.openlibrary.org/b/id/8091016-L.jpg")
                        .build(),
                Book.builder()
                        .id(2L)
                        .title("Harry Potter and the Sorcerer's Stone")
                        .author("J.K. Rowling")
                        .about("A young wizard discovers his magical heritage and attends Hogwarts School of Witchcraft and Wizardry.")
                        .rating(5)
                        .coverImg("https://covers.openlibrary.org/b/id/7984916-L.jpg")
                        .build(),
                Book.builder()
                        .id(4L)
                        .title("To Kill a Mockingbird")
                        .author("Harper Lee")
                        .about("A deeply moving novel about racial injustice and moral growth in the American South.")
                        .rating(5)
                        .coverImg("https://covers.openlibrary.org/b/id/8228691-L.jpg")
                        .build(),
                Book.builder()
                        .id(5L)
                        .title("1984")
                        .author("George Orwell")
                        .about("A dystopian future ruled by Big Brother where truth is subjective and surveillance is constant.")
                        .rating(5)
                        .coverImg("https://covers.openlibrary.org/b/id/7222246-L.jpg")
                        .build(),
                Book.builder()
                        .id(6L)
                        .title("The Great Gatsby")
                        .author("F. Scott Fitzgerald")
                        .about("A tragic love story set in the Roaring Twenties that critiques the American Dream.")
                        .rating(4)
                        .coverImg("https://covers.openlibrary.org/b/id/7352162-L.jpg")
                        .build(),
                Book.builder()
                        .id(7L)
                        .title("Where the Crawdads Sing")
                        .author("Delia Owens")
                        .about("A haunting mystery and coming-of-age story set in the marshlands of North Carolina.")
                        .rating(4)
                        .coverImg("https://covers.openlibrary.org/b/id/10516765-L.jpg")
                        .build(),
                Book.builder()
                        .id(8L)
                        .title("Eleanor Oliphant Is Completely Fine")
                        .author("Gail Honeyman")
                        .about("A quirky, lonely woman finds unexpected friendship and healing in this heartwarming novel.")
                        .rating(4)
                        .coverImg("https://covers.openlibrary.org/b/id/8679221-L.jpg")
                        .build(),

                Book.builder()
                        .id(9L)
                        .title("The Midnight Library")
                        .author("Matt Haig")
                        .about("A woman gets to live out alternative versions of her life in a magical library between life and death.")
                        .rating(4)
                        .coverImg("https://covers.openlibrary.org/b/id/10584364-L.jpg")
                        .build(),

                Book.builder()
                        .id(10L)
                        .title("The Seven Husbands of Evelyn Hugo")
                        .author("Taylor Jenkins Reid")
                        .about("An aging Hollywood icon reveals her scandalous life and true love in this addictive historical novel.")
                        .rating(5)
                        .coverImg("https://covers.openlibrary.org/b/id/12958017-L.jpg")
                        .build(),

                Book.builder()
                        .id(11L)
                        .title("The Rosie Project")
                        .author("Graeme Simsion")
                        .about("A socially awkward professor designs a scientific survey to find a wife – until love messes it up.")
                        .rating(4)
                        .coverImg("https://covers.openlibrary.org/b/id/8391604-L.jpg")
                        .build(),

                Book.builder()
                        .id(12L)
                        .title("A Man Called Ove")
                        .author("Fredrik Backman")
                        .about("A grumpy but lovable old man gets a second chance at life thanks to his new neighbors.")
                        .rating(5)
                        .coverImg("https://covers.openlibrary.org/b/id/11112568-L.jpg")
                        .build(),

                Book.builder()
                        .id(13L)
                        .title("Verity")
                        .author("Colleen Hoover")
                        .about("A struggling writer uncovers disturbing secrets while ghostwriting for a famous author.")
                        .rating(3)
                        .coverImg("https://covers.openlibrary.org/b/id/12814397-L.jpg")
                        .build(),

                Book.builder()
                        .id(14L)
                        .title("Daisy Jones & The Six")
                        .author("Taylor Jenkins Reid")
                        .about("A fictional oral history of a 1970s rock band and the drama that tore them apart.")
                        .rating(4)
                        .coverImg("https://covers.openlibrary.org/b/id/10422244-L.jpg")
                        .build(),

                Book.builder()
                        .id(15L)
                        .title("The Flatshare")
                        .author("Beth O'Leary")
                        .about("Two strangers share a flat – and a bed – but at different times. A romcom with depth.")
                        .rating(4)
                        .coverImg("https://covers.openlibrary.org/b/id/9875463-L.jpg")
                        .build(),
                Book.builder()
                        .id(16L)
                        .title("Malibu Rising")
                        .author("Taylor Jenkins Reid")
                        .about("A glamorous family saga unfolds during one dramatic summer party in 1980s Malibu.")
                        .rating(4)
                        .coverImg("https://covers.openlibrary.org/b/id/12644828-L.jpg")
                        .build()
        );


        return books;
    }


}
