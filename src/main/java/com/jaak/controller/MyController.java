package com.jaak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/message")
    public String getMessage(){
        return "Welcome to the Docker";
    }
}
