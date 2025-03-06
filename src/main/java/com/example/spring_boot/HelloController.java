package com.example.spring_boot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  // Base URL para este controlador
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "¡Hola, Spring Boot!";
    }
}