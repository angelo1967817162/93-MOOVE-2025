package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AdherentController {
    @Autowired
    private AdherentRepository adherentRepository;

    @GetMapping("/adherent")
    public List<Adherent> adherent(){
        return (List<Adherent>) this.adherentRepository.findAll();
    }

    @PostMapping("/adherent")
    public void ajouterAdherent(@RequestBody Adherent nouveauAdherent){
//partie à écrire
        //ListeAdherent.add(nouveauAdherent);
        this.adherentRepository.save();






    }




















}