package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Professeur {
    @Id
    private Integer id;
    private String nom;
    private String email;
    private String MotDePasse;

    public Professeur() {
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getMotDePasse() {

        return MotDePasse;
    }

    public void setMotDePasse(String motDePasse) {

        MotDePasse = motDePasse;
    }
}
