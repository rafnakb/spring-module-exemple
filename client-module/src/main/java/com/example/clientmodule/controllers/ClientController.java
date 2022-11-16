package com.example.clientmodule.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client/v1")
public class ClientController {

    @GetMapping("/")
    public String hello() {
        return "Hello World! Welcome to API.";
    }

}
