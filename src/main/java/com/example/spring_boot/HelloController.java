package com.example.spring_boot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 
 * 
 * 
 *  ESTE METODO SOLO SIRVE PARA VERIFICAR QUE EL SERVICIO ESTA EN LINEA
 * 
 * 
 * 
 */




@RestController // Indica que esta clase es un controlador REST.
@RequestMapping("/api") 
public class HelloController {

    // Este método maneja las solicitudes GET a "/api/hello".
    @GetMapping("/hello")
    public String sayHello() {
        return "¡Hola, Spring Boot!";
    }
}