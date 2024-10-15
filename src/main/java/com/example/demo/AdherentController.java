package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AdherentController {
    private List<Adherent> ListeAdherent = Arrays.asList(
            //new Adherent("id", "name","email","password"),
            new Adherent("1", "tom","tom1@gmail.com","1111"),
            new Adherent("2", "jerry","jerry1@gmail.com","1111"),
            new Adherent("3", "pom","pom1@gmail.com","1111"),
            new Adherent("4", "lom","lom1@gmail.com","1111"),

    );


    @GetMapping("/adherent")
    public List<Adherent> adherent(){
        return ListeAdherent;
    }

    @PostMapping("/adherent")
    public void ajouterAdherent(@RequestBody Adherent nouveauAdherent){
//partie à écrire
        ListeAdherent.add(nouveauAdherent);
    }

















}