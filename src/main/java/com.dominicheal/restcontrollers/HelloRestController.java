package com.dominicheal.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/")
    public String getHelloWorld(){
        return "Hello World";
    }
}
