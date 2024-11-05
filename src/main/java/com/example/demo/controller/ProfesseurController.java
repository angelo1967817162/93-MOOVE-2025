package com.example.demo.controller;

import com.example.demo.model.Professeur;
import com.example.demo.repository.ProfesseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ProfesseurController {
    @Autowired
    private ProfesseurRepository professeurRepository;

    @GetMapping("/professeur")
    public List<Professeur> professeur(){
        return this.professeurRepository.findAll();
    }

    @PostMapping("/professeur")
    public void ajouterprofesseur(@RequestBody Professeur nouveauProfesseur){
        this.professeurRepository.save(nouveauProfesseur);
//partie à écrire
       // ListeProfesseur.add(nouveauAdherent);
    }



}
