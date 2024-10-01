package com.example.demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class CoursController {
    // private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();
    /*private List<Cours> listeCours = new ArrayList<>();*/
    private List<Cours> ListeCours = Arrays.asList(
                 new Cours("danses", "dessin","couture"),
                 new Cours("arts martiaux", "musique","broderie"),
                 new Cours("fitness", "photographie","creation de jeux video"),
                 new Cours("natation", "",""),
                 new Cours("sports d'équipes","", "")

                 );


    @GetMapping("/cours")
    public List<Cours> cours(){
        return ListeCours;
    }

    @PostMapping ("/cours")
    public void ajouterCours(@RequestBody  Cours nouveauCours){
//partie à écrire
        ListeCours.add(nouveauCours);
    }

   /* @GetMapping("/cours/{Sport}")
    public Cours afficherCours(@PathVariable String Sport) {
        //Cherchez le tatoueur ou la tatoueuse dans votre liste et retourner l’objet trouvé.
        for (Sport: listeCours) {

            return this.listeCours.get(Integer.parseInt(Sport));
        }
    }*/
}