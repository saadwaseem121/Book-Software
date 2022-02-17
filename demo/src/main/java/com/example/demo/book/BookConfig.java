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
            Book harry = new Book(747532699L, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy",
                        "Harry Potter and the Sorcerer's Stone is an enthralling start to\n" +
                        "  Harry's journey toward coming to terms with his past and facing his future.",
                        "Bloomsbury", 1997, 12.99);

            repository.saveAll(
                    List.of(harry)
            );
        };
    };
}
