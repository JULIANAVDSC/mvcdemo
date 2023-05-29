package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.ShoesModels;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/shoes")
public class ShoesApiController {
        private static final List<ShoesModels> shoes = new ArrayList<ShoesModels>();
    public ShoesApiController() {
            shoes.add(new ShoesModels("Arezzo", "pink", 37.0));
            shoes.add(new ShoesModels("MiuMiu", "black", 37.5));
            shoes.add(new ShoesModels("Gucci", "white", 38.0));
        }
        @GetMapping
                public List<ShoesModels> getShoes()
        {
            return shoes;
        }
    }