package com.example.spring_boot.model;

// Importamos las anotaciones necesarias para trabajar con JPA (Java Persistence API)
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Esta clase representa un modelo de usuario en la base de datos.
 * Está mapeada a una tabla llamada "users" en la base de datos llamada "base_spring".
 */
@Entity // Indica que esta clase es una entidad JPA (se guarda en la base de datos).
@Table(name = "users") // Especifica el nombre de la tabla en la base de datos.
public class User {

    /**
     * Este campo representa el identificador único del usuario.
     * Se genera automáticamente en la base de datos.
     */
    @Id // Marca este campo como la clave primaria de la tabla.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que el valor se genera automáticamente.
    private Long id;

    /**
     * Este campo almacena el nombre del usuario.
     */
    private String name;

    /**
     * Este campo almacena la edad del usuario.
     */
    private int age;

    /**
     * Constructor vacío necesario para JPA.
     * JPA lo utiliza para crear instancias de esta clase.
     */
    public User() {}

    /**
     * Constructor que permite crear un usuario con un nombre y una edad.
     * 
     * @param name El nombre del usuario.
     * @param age La edad del usuario.
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Obtiene el identificador único del usuario.
     * 
     * @return El ID del usuario.
     */
    public Long getId() { return id; }

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return El nombre del usuario.
     */
    public String getName() { return name; }

    /**
     * Establece el nombre del usuario.
     * 
     * @param name El nuevo nombre del usuario.
     */
    public void setName(String name) { this.name = name; }

    /**
     * Obtiene la edad del usuario.
     * 
     * @return La edad del usuario.
     */
    public int getAge() { return age; }

    /**
     * Establece la edad del usuario.
     * 
     * @param age La nueva edad del usuario.
     */
    public void setAge(int age) { this.age = age; }
}
