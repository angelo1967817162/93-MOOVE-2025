package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoursController {

    @GetMapping("/cours")
    public String showcours(Model model) {
        // contenu Sport
        String[] sports = {"Danses", "Arts martiaux", "Fitness", "Natation", "Sports d'équipes"};

        // contenu Culture
        String[] cultures = {"Dessin", "Musique", "Photographie"};

        // contenu Artisanat
        String[] artisanats = {"Couture", "Broderie", "Création de jeux vidéos"};

        // ajouter donne dans model
        model.addAttribute("sports", sports);
        model.addAttribute("cultures", cultures);
        model.addAttribute("artisanats", artisanats);

        // returne dans page htmlS
        return "cours";
    }
}