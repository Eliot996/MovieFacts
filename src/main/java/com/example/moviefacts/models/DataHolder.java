package com.example.moviefacts.models;

import com.example.moviefacts.services.DataLoading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DataHolder {
    private final ArrayList<MovieFacts> listOfMovieFacts;

    public DataHolder() {
        listOfMovieFacts = DataLoading.loadMovieFacts();
    }

    public List<MovieFacts> getFirst() {
        ArrayList<MovieFacts> movieFacts = new ArrayList<>();
        movieFacts.add(listOfMovieFacts.get(0));
        return movieFacts;
    }

    public boolean add(MovieFacts movieFacts){

        return listOfMovieFacts.add(movieFacts);
    }

    public ArrayList<MovieFacts> getRandom() {
        Random random = new Random();
        ArrayList<MovieFacts> movieFacts = new ArrayList<>();
        movieFacts.add(listOfMovieFacts.get(random.nextInt(listOfMovieFacts.size())));
        return movieFacts;
    }

    public ArrayList<MovieFacts> getTenSortedRandom() {
        Random random = new Random();
        ArrayList<MovieFacts> movieFacts = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            movieFacts.add(listOfMovieFacts.get(random.nextInt(listOfMovieFacts.size())));
        }

        Collections.sort(movieFacts);
        return movieFacts;
    }

    public Integer getAmountOfAwards() {
        int total = 0;
        for (MovieFacts mf : listOfMovieFacts) {
            if (mf.hasAwards()) {
                total++;
            }
        }

        return total;
    }
}
