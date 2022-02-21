package com.example.moviefacts.services;

import com.example.moviefacts.models.MovieFacts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataLoading {

    public static ArrayList<MovieFacts> loadMovieFacts() {
        ArrayList<MovieFacts> movieFacts = new ArrayList<>();
        Scanner scanner = null;
        
        try {
             scanner = new Scanner(new File("src/main/resources/data/imdb-data.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // to get past the first
        scanner.nextLine();

        String[] tempArray;
        while(scanner.hasNextLine()) {
            tempArray = scanner.nextLine().split(";");

            movieFacts.add(new MovieFacts(
                    Integer.parseInt(tempArray[0]),
                    Integer.parseInt(tempArray[1]),
                    tempArray[2],
                    tempArray[3],
                    Integer.parseInt(tempArray[4]),
                    tempArray[5].equals("Yes")));
        }

        return movieFacts;
    }

}
