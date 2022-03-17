package com.example.demo.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/author")
public class AuthorController
{
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAuthors(){
        return authorService.getAuthors();
    }

    @GetMapping(path = "{author_id}")
    public Optional<Author> getAuthorById(@PathVariable("author_id") Long author_id)
    {
        return authorService.getAuthorById(author_id);
    }

    @PostMapping
    public void addNewAuthor(@RequestBody Author author){
        authorService.addNewAuthor(author);
    }

}
