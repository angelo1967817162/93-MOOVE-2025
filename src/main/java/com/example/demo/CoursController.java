package com.example.demo;
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
import com.sun.management.UnixOperatingSystemMXBean;
import org.springframework.web.bind.annotation.*;

//import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;



@RestController
public class CoursController {
    private List<Cours> listeCours = new ArrayList<>();

    @PostMapping("/cours")
    public List<Cours> ajouterCours(@RequestBody Cours nouveauCours){
        this.listeCours.add(nouveauCours);
        return listeCours;
    }

    @GetMapping("/cours")
    public List<Cours> getListeCours() {
        return this.listeCours;
    }

    @GetMapping("/cours/{Sport}")
    public Cours afficherCours(@PathVariable String Sport) {
//Cherchez le tatoueur ou la tatoueuse dans votre liste et retourner l’objet trouvé.
        //faire un foreach sur listeTatoueurs
        //Pour chaque Tatoueur dans chaque case, vérifiez si getId==id
        // si oui, retrouver le tatoueur
        for (Cours t: this.listeCours){
            if(t.getSport()== t.Sport){
                return t;
            }
        }
        return null;
    }

    @PutMapping("/cours/{Sport}")
    public void modifierCours(@RequestBody Cours cours, @PathVariable String Sport) {
        //parourir la liste, utiliser la fonction set
        for (int i = 0; i < this.listeCours.size(); i++) {
            if (this.listeCours.get(i).getSport() == Sport) {
                this.listeCours.set(i, cours);
            }
        }
// autre manière de faire le @PutMapping
       /* for(Tatoueur t : this.listeTatoueurs){
            if(t.getId()==id){
                t.setNom(tatoueurAModif.getNom());
                t.setStyle(tatoueurAModif.getStyle());
            }
        }
        */
    }
    @DeleteMapping("/cours/{Sport}")
    public void supprimerCours(@PathVariable String Sport) {
        for (int i = 0; i < this.listeCours.size(); i++) {
            if (this.listeCours.get(i).getSport() == Sport) {
                this.listeCours.remove(i);
            }

        }
    }

    @DeleteMapping("/cours")
    public void supprimerCours() {
        //Supprime tout
        //liste.
        this.listeCours.clear();
    }

}