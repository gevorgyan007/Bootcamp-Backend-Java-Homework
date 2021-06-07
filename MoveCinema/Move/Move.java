package com.company.MoveCinema.Move;

public class Move {
    private String title;
    private String directorFirstName;
    private String directorLastName;
    private int directorYear;
    private String genre;
    private int year;
    private static int id;
   // private Director directors;


    public String getDirectorFirstName() {
        return directorFirstName;
    }

    public void setDirectorFirstName(String directorFirstName) {
        this.directorFirstName = directorFirstName;
    }

    public String getDirectorLastName() {
        return directorLastName;
    }

    public void setDirectorLastName(String directorLastName) {
        this.directorLastName = directorLastName;
    }

    public int getDirectorYear() {
        return directorYear;
    }

    public void setDirectorYear(int directorYear) {
        this.directorYear = directorYear;
    }

    @Override
    public String toString() {
        return "Move{" +
                "title='" + title + '\'' +
                ", directorFirstName='" + directorFirstName + '\'' +
                ", directorLastName='" + directorLastName + '\'' +
                ", directorYear=" + directorYear +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public Move(String title, String directorFirstName, String directorLastName, int directorYear, String genre, int year) {
        this.title = title;
        this.directorFirstName = directorFirstName;
        this.directorLastName = directorLastName;
        this.directorYear = directorYear;
        this.genre = genre;
        this.year = year;
        id++;
    }
//public Move(String title, String director, String genre, int year) {
    //    this.title = title;
    //    this.director = director;
    //    this.genre = genre;
    //    this.year = year;
    //    id++;
    //}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
