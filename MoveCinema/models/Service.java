package com.company.MoveCinema.models;

import com.company.MoveCinema.Move.Director;
import com.company.MoveCinema.Move.Move;
import com.company.MoveCinema.utility.MovieRequest;

import java.util.Scanner;

public class Service {
    public static void create(MovieRequest movieRequest) {
        if (movieRequest.getTitle() == null) {
            throw new NullPointerException("Cant be null name of move");
        }
        if (movieRequest.getYear() < 0) {
            throw new NumberFormatException("Year cant be < 0");
        }
        if (movieRequest.getDirectorId() < 0) {
            throw new NullPointerException("Cant be ID < 0");
        }
        setDirector();
        DataBase.add(new Move(movieRequest.getTitle(),
               DataBase.getDirector(movieRequest.getDirectorId()).getFirstNameOfDirector(),
                DataBase.getDirector(movieRequest.getDirectorId()).getLastNameOfDirector(),
                DataBase.getDirector(movieRequest.getDirectorId()).getYearOfDirector(),
                movieRequest.getGenre(), movieRequest.getYear()));
    }

    private static void setDirector(){
        Director director0= new Director("Steven","Spielberg", 1946);
        Director director1= new Director("Peter","Jackson", 1961);
        Director director2= new Director("Michael","Benjamin", 1965);
        Director director3= new Director("James","Cameron", 1954);
        DataBase.addDirector(director0);
        DataBase.addDirector(director1);
        DataBase.addDirector(director2);
        DataBase.addDirector(director3);
    }

    public static void readAll() {
        System.out.println(DataBase.gtoString());
    }

    public static void readById(int idMove) {
        if (idMove >= 0 && idMove < DataBase.size())
            System.out.println(DataBase.get(idMove));
    }

    public static void update(int idMove) {
        System.out.println("Enter update type");
        System.out.println("1.Title  2.Director 3.genre 4.ALL");
        int updateMoveField = new Scanner(System.in).nextInt();
        if (updateMoveField == 1) {
            System.out.println("Select changed name movie");
            String changeNameMovie = new Scanner(System.in).next();
            DataBase.updateTitle(idMove, changeNameMovie);
        } else if (updateMoveField == 2) {
            System.out.println("Select changed Id director");
            int changeDirectorId = new Scanner(System.in).nextInt();
            DataBase.updateDirector(idMove, changeDirectorId);
        } else if (updateMoveField == 3) {
            System.out.println("Select changed year movie");
            int changeYearMovie = new Scanner(System.in).nextInt();
            DataBase.updateYear(idMove, changeYearMovie);
        }
        if (updateMoveField == 4) {
            System.out.println("Select changed name movie");
            String changeNameMovie = new Scanner(System.in).next();
            System.out.println("Select changed Id director");
            int changeDirectorId = new Scanner(System.in).nextInt();
            System.out.println("Select changed year movie");
            int changeYearMovie = new Scanner(System.in).nextInt();
            System.out.println("Select changed genre ");
            String changeGenreMovie = new Scanner(System.in).next();
            DataBase.updateAllMoveField(idMove,changeNameMovie,changeDirectorId,changeYearMovie,changeGenreMovie);
        }
    }

    public static void delete(int index) {
        DataBase.remove(index);
    }
}
