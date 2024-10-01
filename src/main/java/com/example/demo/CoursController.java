package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoursController {

    @GetMapping("/cours")
    public String showcours(Model model) {
        // Sport内容
        String[] sports = {"Danses", "Arts martiaux", "Fitness", "Natation", "Sports d'équipes"};

        // Culture内容
        String[] cultures = {"Dessin", "Musique", "Photographie"};

        // Artisanat内容
        String[] artisanats = {"Couture", "Broderie", "Création de jeux vidéos"};

        // 将数据添加到模型中
        model.addAttribute("sports", sports);
        model.addAttribute("cultures", cultures);
        model.addAttribute("artisanats", artisanats);

        // 返回显示的HTML页面
        return "cours";
    }
}