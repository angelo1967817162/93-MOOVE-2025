package com.example.demo.repository;

import com.example.demo.Professeur;
import com.example.demo.model.Tatoueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur,Integer> {
    List<Professeur> findByStyle(String style);
}