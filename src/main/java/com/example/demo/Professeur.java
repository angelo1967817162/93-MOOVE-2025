package com.example.demo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Professeur {
    @Id
    private Integer id;
    private String nom;
    private String email;
    private String mot_de_passe;
}
