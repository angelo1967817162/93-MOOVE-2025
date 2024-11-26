package com.example.demo.repository;


import com.example.demo.model.Cours;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.nio.channels.FileChannel;

@Repository
public interface CoursRepository extends JpaRepository<Cours,Integer> {


}
