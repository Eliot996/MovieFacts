package com.example.moviefacts.models;

import com.example.moviefacts.services.DataLoading;

import java.util.ArrayList;

public class DataHolder {
    private ArrayList<MovieFacts> listOfMovieFacts;

    public DataHolder() {
        listOfMovieFacts = DataLoading.loadMovieFacts();
    }

    public boolean add(MovieFacts movieFacts){

        return listOfMovieFacts.add(movieFacts);
    }

    public ArrayList<MovieFacts> getListOfMovieFacts() {
        return listOfMovieFacts;
    }
}
