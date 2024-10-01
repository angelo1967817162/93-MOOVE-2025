package com.example.demo;

public class Cours{
    public String Sport;
    public String Culture;
    public String Artisanat;

    public Cours(String Sport,String Culture,String Artisanat){
        this.Sport = Sport;
        this.Culture =Culture;
        this.Artisanat = Artisanat;


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


