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

    public String getNameOfFirstMovie() {

        return listOfMovieFacts.get(0).getTitle();
    }

    public boolean add(MovieFacts movieFacts){

        return listOfMovieFacts.add(movieFacts);
    }

    public List<MovieFacts> getRandom() {
        Random random = new Random();
        ArrayList<MovieFacts> movieFacts = new ArrayList<>();
        movieFacts.add(listOfMovieFacts.get(random.nextInt(listOfMovieFacts.size())));
        return movieFacts;
    }

    public List<MovieFacts> getTenSortedRandom() {
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

    public List<MovieFacts> getMoviesWithCharacters(char character, int amount) {
        ArrayList<MovieFacts> movieFacts = new ArrayList<>();

        for (MovieFacts mf : listOfMovieFacts) {
            if (mf.hasCharacters(character, amount))
            movieFacts.add(mf);
        }

        return movieFacts;
    }

    public boolean IsLonger(String g1, String g2) {
        int g1Length = 0;
        int g1Amount = 0;
        int g2Length = 0;
        int g2Amount = 0;

        for (MovieFacts mf : listOfMovieFacts) {
            if (mf.isSubject(g1)) {
                g1Length += mf.getLength();
                g1Amount++;
            }
            if (mf.isSubject(g2)) {
                g2Length += mf.getLength();
                g2Amount++;
            }
        }


        return g1Length/g1Amount > g2Length/g2Amount;
    }
}
