package com.example.aswcicdAmigoscode.Hello;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/")
@AllArgsConstructor
public class HelloController {

    @GetMapping("/hello")
    public String getHelloWorld(){
        return "Hello World and Diako";
    }
}
