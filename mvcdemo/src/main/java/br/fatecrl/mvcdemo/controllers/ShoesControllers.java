package br.fatecrl.mvcdemo.controllers;
import br.fatecrl.mvcdemo.models.ShoesModels;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ShoesModels")
public class ShoesControllers {

    private static final List<ShoesModels> shoes = new ArrayList<ShoesModels>();

    public ShoesControllers() {

        shoes.add(new ShoesModels("Arezzo", "pink", 37.0));
        shoes.add(new ShoesModels("MiuMiu", "black", 37.5));
        shoes.add(new ShoesModels("Gucci", "white", 38.0));

    }
    @GetMapping
    public String getShoes(Model model) {
        model.addAttribute("Shoes", shoes);

        return "Shoes";
    }
}

