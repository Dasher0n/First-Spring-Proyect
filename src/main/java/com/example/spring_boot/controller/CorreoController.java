package com.example.spring_boot.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot.service.EmailService;

import jakarta.mail.MessagingException;

@SpringBootApplication
@RestController
public class CorreoController {

    private final EmailService emailService;

    public CorreoController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/enviar")
    public String enviarCorreo(@RequestParam String para, @RequestParam String nombre) {
        try {
            emailService.enviarCorreoRegistro(para, nombre);
            return "Correo enviado a " + para;
        } catch (MessagingException e) {
            return "Error al enviar el correo: " + e.getMessage();
        }
    }

}
