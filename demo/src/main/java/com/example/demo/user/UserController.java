package com.example.demo.user;

import com.example.demo.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers()
    {
        return userService.getUsers();
    }

    @GetMapping(path = "{email}")
    public Optional<User> getUserByEmail(@PathVariable("email") String email)
    {
        return userService.getUserByEmail(email);
    }
}
