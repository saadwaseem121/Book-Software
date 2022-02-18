package com.example.demo.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {
    @Bean
    CommandLineRunner bookCommandLineRunner(BookRepository repository){
        return args->
        {
            Book book1 = new Book("0747532699", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy",
                        "Harry Potter and the Sorcerer's Stone is an enthralling start to\n" +
                        "  Harry's journey toward coming to terms with his past and facing his future.",
                        "Bloomsbury", 1997, 12.99);
            Book book2 = new Book("0261103342", "The Hobbit", "J.R.R. Tolkien", "High fantasy",
                    "The critically acclaimed novel that kickstarted " +
                            "the famous Middle Earth novels by J.R.R. Tolkien.",
                    "Harper Collins", 1937, 14.99);
            Book book3 = new Book("0670813028", "It", "Stephen King", "Horror",
                    "One of Stephen King's most prolific novels, starring the iconic clown character, " +
                            "Pennywise.", "Viking", 1986, 20.99);
            repository.saveAll(
                    List.of(book1, book2, book3)
            );
        };
    };
}
