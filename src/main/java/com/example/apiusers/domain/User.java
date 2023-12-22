package com.example.apiusers.domain;

import jakarta.persistence.*;
import lombok.*;
@AllArgsContructor
@NoArgsContructor
@Getter
@Setter
@ToString
@Table(name = "users")
@Entity

public class User{
    @id
    @generatedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
}

/*@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;

    // Constructor sin argumentos
    public User() {
    }

    // Constructor con argumentos
    public User(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    // Getter para id
    public Long getId() {
        return id;
    }

    // Setter para id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para email
    public String getEmail() {
        return email;
    }

    // Setter para email
    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
} */