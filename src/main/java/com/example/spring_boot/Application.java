package com.example.spring_boot;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Indica que esta clase es la clase principal de la aplicación Spring Boot.
public class Application {
	
	// Este método inicia la aplicación Spring Boot.
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().load();

        System.setProperty("MAIL_USERNAME", dotenv.get("MAIL_USERNAME"));
        System.setProperty("MAIL_PASSWORD", dotenv.get("MAIL_PASSWORD"));

		SpringApplication.run(Application.class, args);
	}

}
