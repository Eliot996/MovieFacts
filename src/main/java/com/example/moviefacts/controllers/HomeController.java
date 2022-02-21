package com.example.moviefacts.controllers;

import com.example.moviefacts.models.DataHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    DataHolder dataHolder = new DataHolder();

    @GetMapping
    public String index() {
        return "index";
    }
}
