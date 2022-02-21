package com.example.moviefacts.models;

public class MovieFacts {
    private int Year;
    private int Length;
    private String Title;
    private String Subject;
    private int Popularity;
    private boolean Awards;

    public MovieFacts(int year, int length, String title, String subject, int popularity, boolean awards) {
        Year = year;
        Length = length;
        Title = title;
        Subject = subject;
        Popularity = popularity;
        Awards = awards;
    }

    public int getYear() {
        return Year;
    }

    public int getLength() {
        return Length;
    }

    public String getTitle() {
        return Title;
    }

    public String getSubject() {
        return Subject;
    }

    public int getPopularity() {
        return Popularity;
    }

    public boolean hasAwards() {
        return Awards;
    }
}
