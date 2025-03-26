package com.example.spring_boot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring_boot.model.User;
import com.example.spring_boot.repository.UserRepository;

@Service // Indica que esta clase es un servicio de Spring.
public class UserService {

    // Usamos esta variable privada para acceder al repositorio de usuarios.
    private final UserRepository userRepository;

    // Spring inyecta automáticamente el repositorio de usuarios cuando se crea este servicio.
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Este método llama al repositorio para obtener la lista de todos los usuarios.
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    // Este método llama al repositorio para agregar un nuevo usuario.
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
