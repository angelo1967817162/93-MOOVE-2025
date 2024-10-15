package com.example.demo;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AdherentRepository extends CrudRepository<Adherent, Integer> {
    List<Adherent> findByEmail(String email);
    void deleteByEmail(String email);

}