package com.example.demo.controller;


import com.example.demo.model.Adherent;
import com.example.demo.repository.AdherentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AdherentController {

    @Autowired
    private AdherentRepository adherentRepository;


    @GetMapping("/adherent")
    public List<Adherent> getAllAdherents() {
        return (List<Adherent>) adherentRepository.findAll();
    }


    @PostMapping
    public Adherent createUser(@RequestBody Adherent adherent) {
        return adherentRepository.save(adherent);
    }


    @GetMapping("/{id}")
    public Adherent getAdherentById(@PathVariable Integer id) {
        return adherentRepository.findById(id).orElse(null);
    }


    @PutMapping("/{id}")
    public Adherent updateAdherent(@PathVariable Integer id, @RequestBody Adherent updatedAdherent) {
        return adherentRepository.findById(id).map(adherent -> {
            adherent.setName(updatedAdherent
                    .getName());
            adherent.setEmail(updatedAdherent.getEmail());
            adherent.setPassword(updatedAdherent.getPassword());
            return adherentRepository.save(adherent);
        }).orElse(null);
    }


    @DeleteMapping("/{id}")
    public void deleteAdherent(@PathVariable Integer id) {
        adherentRepository.deleteById(id);
    }
}






















