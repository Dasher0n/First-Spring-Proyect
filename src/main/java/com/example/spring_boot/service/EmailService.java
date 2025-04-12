package com.example.spring_boot.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private TemplateEngine templateEngine;

    public void enviarCorreoRegistro(String to, String nombre) throws MessagingException {
        // Preparar contexto de la plantilla
        Context context = new Context();
        context.setVariable("nombre", nombre);

        // Renderizar HTML
        String htmlContent = templateEngine.process("email-template", context);

        // Enviar correo
        MimeMessage mensaje = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mensaje, true, "UTF-8");

        helper.setTo(to);
        helper.setSubject("Bienvenido a nuestro servicio");
        helper.setText(htmlContent, true); // true = HTML

        mailSender.send(mensaje);
    }
}
