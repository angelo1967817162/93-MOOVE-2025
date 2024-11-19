package com.example.demo.repository;


import com.example.demo.model.Cours;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CoursRepository extends JpaRepository<Cours,Integer> {


    Cours findBySport(String sport);
}
