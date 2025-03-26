package com.example.spring_boot.controller;

// Importamos las clases necesarias para trabajar con Spring y manejar solicitudes HTTP
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot.model.User;
import com.example.spring_boot.service.UserService;

/**
 * Este es el controlador que maneja las solicitudes relacionadas con los usuarios.
 * Aquí definimos las rutas (endpoints) que el cliente puede usar para interactuar con los usuarios.
 */
@RestController // Indica que esta clase es un controlador REST.
@RequestMapping("/api/users") // Define la ruta base para todas las solicitudes de este controlador.
public class UserController {

    // Usamos esta variable privada para acceder al servicio de usuarios.
    private final UserService userService;

    /**
     * Este es el constructor de la clase. 
     * Spring inyecta automáticamente el servicio de usuarios cuando se crea este controlador.
     * 
     * userService El servicio que contiene la lógica para manejar usuarios.
     */
    public UserController(UserService userService) {
        this.userService = userService; // Guardamos el servicio en una variable para usarlo en los métodos.
    }

    /**
     * Este método maneja las solicitudes GET a "/api/users".
     * Sirve para obtener la lista de todos los usuarios.
     * 
     * @return Una lista de usuarios (User).
     */
    @GetMapping // Indica que este método responde a solicitudes HTTP GET.
    public List<User> getUsers() {
        return userService.getUsers(); // Llama al servicio para obtener la lista de usuarios.
    }

    /**
     * Este método maneja las solicitudes POST a "/api/users".
     * Sirve para agregar un nuevo usuario.
     * 
     * @param user El usuario que se envía en el cuerpo de la solicitud.
     * @return El usuario que se agregó.
    */
     
    @PostMapping // Indica que este método responde a solicitudes HTTP POST.
    public User addUser(@RequestBody User user) {
        // @RequestBody indica que el usuario se envía en el cuerpo de la solicitud.
        return userService.addUser(user); // Llama al servicio para agregar el usuario y devuelve el resultado.
    }
    
}
