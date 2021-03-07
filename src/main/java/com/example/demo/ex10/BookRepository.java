package com.example.demo.ex10;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title); //has to include name of attribute in Book object
    Book findByISBN(String ISBN);
    Book findByISBNAndAuthor(String author, String ISBN);
    List<Book> findByAuthorOrderByPagesNumDesc(String author);
    List<Book> findByTitleStartsWith(String startingString);
    List<Book> findByPagesNumBetween(int min, int max);
    @Query(value = "SELECT b from books b WHERE b.pagesNum > :x")
    List<Book> findWherePagesNumGraterThanX(@Param("x") Integer x);
}
