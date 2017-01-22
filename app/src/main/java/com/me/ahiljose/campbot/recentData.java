package com.me.ahiljose.campbot;

/**
 * Created by AJ on 1/20/2017.
 */
public class recentData {
    private String title, genre, year;

    public recentData() {
    }

    public recentData(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}