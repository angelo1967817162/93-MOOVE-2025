package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ProfesseurController {
    @Autowired
    private com.example.demo.repository.ProfesseurRepository professeurRepository;

    @GetMapping("/professeur")
    public List<Professeur> professeur(){
        return this.professeurRepository.findAll();
    }

   // @PostMapping("/professeur")
    public void ajouterprofesseur(@RequestBody Adherent nouveauProfesseur){
        this.professeurRepository.save();
//partie à écrire
       // ListeProfesseur.add(nouveauAdherent);

    }

}
