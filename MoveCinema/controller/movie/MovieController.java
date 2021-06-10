package com.company.MoveCinema.controller.movie;

import com.company.MoveCinema.service.movie.MovieService;
import com.company.MoveCinema.controller.movie.model.MovieRequest;

import java.util.Scanner;

public class MovieController {

    public static void start() {
        System.out.println("Please select command!");
        System.out.println("1.Create \n 2.Read All \n 3.Read ById \n 4.Update \n 5.Delete");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            create();
        } else if (input == 2) {
            getAll();
        } else if (input == 3) {
            getById();
        } else if (input == 4) {
            update();
        } else if (input == 5) {
            System.out.println("enter id for delete");
            int idMovieDel = new Scanner(System.in).nextInt();
            //TODO add deleteById
            MovieService.delete(idMovieDel);
        }

        System.out.println(" input 1 for continue! for Exit enter 2");
        int comm = new Scanner(System.in).nextInt();
        if (comm == 1) {
            start();
        } else if (comm == 2) {
            System.exit(0);
        }
    }

    private static void update() {
        System.out.println("enter id for update");
        int idMovieUpdate = new Scanner(System.in).nextInt();
        MovieService.update(idMovieUpdate);
    }

    private static void getById() {
        System.out.println("enter id");
        int idMovie = new Scanner(System.in).nextInt();
        MovieService.readById(idMovie);
    }

    private static void getAll() {
        MovieService.readAll();
    }

    private static void create(){
        System.out.println("please input move title");
        String title = new Scanner(System.in).next();
        System.out.println("0.Steven Spielberg \n 1.Peter Jackson \n 2.Michael Benjamin \n 3.James Cameron ");
        System.out.println("please input move Director Id");
        int directorId = new Scanner(System.in).nextInt();
        System.out.println("please input move year");
        int year = new Scanner(System.in).nextInt();
        System.out.println("please input move genre(Comedy,Melodrama, History, Horror, Drama)");
        String genre = new Scanner(System.in).next();
        MovieService.create(new MovieRequest(title, directorId, genre, year));
        System.out.println("Move is creating");
    }

}
