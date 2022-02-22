package com.example.moviefacts.models;

public class MovieFacts implements Comparable<MovieFacts>{
    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private boolean awards;

    public MovieFacts(int year, int length, String title, String subject, int popularity, boolean awards) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.awards = awards;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public boolean hasAwards() {
        return awards;
    }

    public String getAwards() {
        if (awards) {
            return "yes";
        } else {
            return "no";
        }
    }

    @Override
    public int compareTo(MovieFacts o) {
        return this.year - o.year;
    }

    public boolean hasCharacters(char character, int amount) {
        int counter = 0;

        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) == character) {
                counter++;
            }
        }

        return counter == amount;
    }
}
