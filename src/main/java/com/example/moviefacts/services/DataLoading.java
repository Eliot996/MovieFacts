package com.example.moviefacts.services;

import com.example.moviefacts.models.MovieFacts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataLoading {

    public static ArrayList<MovieFacts> loadMovieFacts() {
        ArrayList<MovieFacts> movieFacts = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("src/main/resources/data/imdb.data"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
