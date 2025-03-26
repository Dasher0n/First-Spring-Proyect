package com.example.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Indica que esta clase es la clase principal de la aplicación Spring Boot.
public class Application {
	
	// Este método inicia la aplicación Spring Boot.
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
