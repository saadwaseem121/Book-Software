package com.example.demo.book;

import com.example.demo.author.Author;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


//    @Query("SELECT b FROM Book b WHERE b.ISBN = ?1")
    Optional<Book> findBookByISBN(String ISBN);
//    @Query("SELECT b FROM Book b JOIN author ON b.author_id = author.id WHERE b.author_id = ?1")
    List<Book> findBooksByAuthor_Id(Long author_id);
    List<Book> findBooksByGenre(String genre);
}
