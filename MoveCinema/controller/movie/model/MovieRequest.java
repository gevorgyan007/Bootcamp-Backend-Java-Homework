package com.company.MoveCinema.controller.movie.model;
import java.lang.*;
public class MovieRequest {

    private String title;
    private String genre;
    private int year;
    private int directorId;

    public int getDirectorId() {
        return directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MovieRequest(String title, int directorId, String genre, int year) {
        this.title = title;
        this.directorId = directorId;
        this.genre = genre;
        this.year = year;
    }

    public MovieRequest() {
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
