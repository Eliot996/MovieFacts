package com.example.moviefacts.controllers;

import com.example.moviefacts.models.DataHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    DataHolder dataHolder = new DataHolder();

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/getFirstShown")
    public String getFirstShown(Model model) {
        model.addAttribute("movies", dataHolder.getFirst());
        return "firstShown";
    }

    @GetMapping("/random")
    public String getRandom(Model model) {
        model.addAttribute("movies", dataHolder.getRandom());
        return "firstShown";
    }
}
