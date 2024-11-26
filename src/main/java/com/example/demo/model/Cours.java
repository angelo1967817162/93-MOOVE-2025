package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String Sport;
    public String Culture;
    public String Artisanat;

    public Cours(String Sport,String Culture,String Artisanat){
        this.Sport = Sport;
        this.Culture =Culture;
        this.Artisanat = Artisanat;

    }

    public Cours() {
    }



    public void setSport(String sport) {
        Sport = sport;
    }

    public void setCulture(String culture) {
        Culture = culture;
    }

    public void setArtisanat(String artisanat) {
        Artisanat = artisanat;
    }

    public String getSport() {

        return Sport;
    }
    public String getCulture(){

        return Culture;
    }
    public String getArtisanat(){
        return Artisanat;
    }

}
