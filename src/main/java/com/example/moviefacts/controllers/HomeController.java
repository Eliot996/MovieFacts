package com.example.moviefacts.controllers;

import com.example.moviefacts.models.DataHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        return "getRandom";
    }

    @GetMapping("/tenSortedRandom")
    public String getTenSortedRandom(Model model) {
        model.addAttribute("movies", dataHolder.getTenSortedRandom());
        return "tenSortByPopularity";
    }

    @GetMapping("/howManyWonAnAward")
    public String getHowManyWonAnAward(Model model) {
        model.addAttribute("amount", dataHolder.getAmountOfAwards());
        return "howManyWonAnAward";
    }

    @GetMapping("/filter")
    public String filterByCharacter(Model model, @RequestParam char character, @RequestParam int amount) {
        model.addAttribute("movies", dataHolder.getMoviesWithCharacters(character, amount));
        model.addAttribute("character", character);
        model.addAttribute("amount", amount);
        return "filter";
    }

    @GetMapping("/longest")
    public String filterByCharacter(Model model, @RequestParam String g1, @RequestParam String g2) {
        model.addAttribute("isLonger", dataHolder.IsLonger(g1, g2));
        model.addAttribute("g1", g1);
        model.addAttribute("g2", g2);
        System.out.println(model.getAttribute("isLonger"));
        return "longest";
    }
}
