package com.example.demo.controller;
/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

@RestController
public class CoursController {
    // private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();
    /*private List<Cours> listeCours = new ArrayList<>();
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
    }
   @PutMapping("/cours/{id}")
   public Cours modifierCours(@RequestBody Cours coursAModif, @PathVariable int id)
           throws ChangeSetPersister.NotFoundException {
       Cours c = this.ListeCours.get(id).Artisanat(() -> new
               ChangeSetPersister.NotFoundException("Tatoueur non trouvé"));
       c.getArtisanat(coursAModif.Artisanat);
       t.setStyle(tatoueurAModif.getStyle());
       return this.tatoueurRepository.save(t);
   }
    @DeleteMapping("/cours/{id}")
    public void supprimerTatoueur(@PathVariable int id) throws ChangeSetPersister.NotFoundException {
        Tatoueur t = this.tatoueurRepository.findById(id).orElseThrow(() -> new
                ChangeSetPersister.NotFoundException("Tatoueur non trouvé"));
        this.tatoueurRepository.delete(t);
    }

}*/
import com.example.demo.model.Cours;
import com.example.demo.repository.AdherentRepository;
import com.example.demo.repository.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

//import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


@RestController
@RequestMapping("/cours")
public class CoursController {
    @Autowired
    private CoursRepository coursRepository;


    @PostMapping
    public Cours createCours(@RequestBody Cours nouveauCours) {
        return coursRepository.save(nouveauCours);
    }

    @GetMapping("/cours")
    public List<Cours> getAllCours() {
        return this.coursRepository.findAll();
    }

  /*  @GetMapping("/{sport}")
    public Cours getCoursBySport(@PathVariable String sport) {
        return coursRepository.findBySport(sport);
    }*/

//    @GetMapping("/cours/{Sport}")
//    public Cours afficherCours(@PathVariable String Sport) {
////Cherchez le tatoueur ou la tatoueuse dans votre liste et retourner l’objet trouvé.
//        //faire un foreach sur listeTatoueurs
//        //Pour chaque Tatoueur dans chaque case, vérifiez si getId==id
//        // si oui, retrouver le tatoueur
//        for (Cours c : this.coursRepository.findAll()) {
//            if (c.getSport() == c.Sport) {
//                return c;
//            }
//        }
//        return null;
//    }

    @PutMapping("/{id}")
    public Cours updateCours(@PathVariable Integer id, @RequestBody Cours updatedCours) {
        return coursRepository.findById(id)
                .map(cours -> {
                    cours.setSport(updatedCours.getSport());
                    cours.setCulture(updatedCours.getCulture());
                    cours.setArtisanat(updatedCours.getArtisanat());
                    return coursRepository.save(cours);
                })
                .orElseThrow(() -> new RuntimeException("Cours not found with id " + id));
    }
//    @PutMapping("/{id}")
//    public void modifierCours(@RequestBody Cours cours, @PathVariable String Sport) {
//        //parourir la liste, utiliser la fonction set
//        for (int i = 0; i < this.coursRepository.findBy(id); i++) {
//            if (this.coursRepository.get(i).getSport() == Sport) {
//                this.coursRepository.set(i, cours);
//            }
//        }
// autre manière de faire le @PutMapping
       /* for(Tatoueur t : this.listeTatoueurs){
            if(t.getId()==id){
                t.setNom(tatoueurAModif.getNom());
                t.setStyle(tatoueurAModif.getStyle());
            }
        }
        */


    @DeleteMapping("/id")
    public void supprimerCours() {
        coursRepository.delete((Cours) id);

    }
}
