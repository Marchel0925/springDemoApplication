package com.example.demo.rest;

import com.example.demo.ex10.Book;
import com.example.demo.ex10.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping("/book")
    public List<Book> allBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/book/{title}")
    public List<Book> generateBook(@PathVariable("title") String title){
        Book book1 = Book.builder()
                .ISBN("12h2")
                .pagesNum(200)
                .author("Martin")
                .title("Harry Potter")
                .build();

        Book book2 = Book.builder()
                .ISBN("")
                .pagesNum(234)
                .author("Marcis")
                .title("Big Boi")
                .build();

        bookRepository.saveAll(List.of(book1, book2));
        List<Book> result = bookRepository.findByTitle(title);
        return result;
    }

    @GetMapping("/book/find/{isbn}")
    public Book byISBN(@PathVariable("isbn") String ISBN){
        return bookRepository.findByISBN(ISBN);
    }

    @GetMapping("/book/findISBNAndAuthor/{isbn}/{author}")
    public Book byISBNAndAuthor(@PathVariable("author") String author, @PathVariable("isbn") String ISBN){
        return bookRepository.findByISBNAndAuthor(author, ISBN);
    }

    @GetMapping("/book/findBetween/{min}/{max}")
    public List<Book> pagesNumBetween(@PathVariable("min") int min, @PathVariable("max") int max){
        Book book1 = Book.builder()
                .ISBN("12h2")
                .pagesNum(200)
                .author("Martin")
                .title("Harry Potter")
                .build();

        Book book2 = Book.builder()
                .ISBN("")
                .pagesNum(3000)
                .author("Marcis")
                .title("Big Boi")
                .build();

        bookRepository.saveAll(List.of(book1, book2));
        List<Book> result = bookRepository.findByPagesNumBetween(min, max);
        return result;
    }
}
