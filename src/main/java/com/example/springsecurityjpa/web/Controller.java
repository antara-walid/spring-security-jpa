package com.example.springsecurityjpa.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String welcome()
    {
        return "welcome";
    }

    @GetMapping("/admin")
    public String adminMethode()
    {
        return "admin";
    }
    @GetMapping("/user")
    public String userMethode()
    {
        return "user";
    }
}
