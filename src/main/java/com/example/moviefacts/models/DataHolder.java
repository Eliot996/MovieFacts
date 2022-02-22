package com.example.moviefacts.models;

import com.example.moviefacts.services.DataLoading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataHolder {
    private ArrayList<MovieFacts> listOfMovieFacts;

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

    public ArrayList<MovieFacts> getListOfMovieFacts() {
        return listOfMovieFacts;
    }

    public ArrayList<MovieFacts> getRandom() {
        Random random = new Random();
        ArrayList<MovieFacts> movieFacts = new ArrayList<>();
        movieFacts.add(listOfMovieFacts.get(random.nextInt(listOfMovieFacts.size())));
        return movieFacts;
    }
}
