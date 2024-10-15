package com.example.demo;

public class Adherent {
    public int Id;
    public String Utilisateur;
    public String MotDePasse;

    public Adherent( int Id, String Utilisateur, String motDePasse){
        this.Id = Id;
        this.Utilisateur = Utilisateur;
        this.MotDePasse =motDePasse;
    }

    public int getId()
    {
        return Id;
    }
    public String getUtilisateur()
    {
        return Utilisateur;
    }
    public String getMotDePasse(){
        
        return MotDePasse;
    }




}
