package com.company.MoveCinema.utility;

import com.company.MoveCinema.models.Service;

import java.util.Scanner;

public class Controller {

    public static void start() {
        System.out.println("Please select command!");
        System.out.println("1.Create \n 2.Read All \n 3.Read ById \n 4.Update \n 5.Delete");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("please input move title");
            String title = new Scanner(System.in).next();
            System.out.println("0.Steven Spielberg \n 1.Peter Jackson \n 2.Michael Benjamin \n 3.James Cameron ");
            System.out.println("please input move Director Id");
            int directorId = new Scanner(System.in).nextInt();
            System.out.println("please input move year");
            int year = new Scanner(System.in).nextInt();
            System.out.println("please input move genre(Comedy,Melodrama, History, Horror, Drama)");
            String genre = new Scanner(System.in).next();

            Service.create(new MovieRequest(title, directorId, genre, year));
            System.out.println("Move is creating");
        } else if (input == 2) {
            Service.readAll();
        } else if (input == 3) {
            System.out.println("enter id");
            int idMovie = new Scanner(System.in).nextInt();
            Service.readById(idMovie);
        } else if (input == 4) {
            System.out.println("enter id for update");
            int idMovieUpdate = new Scanner(System.in).nextInt();
            Service.update(idMovieUpdate);
        } else if (input == 5) {
            System.out.println("enter id for delete");
            int idMovieDel = new Scanner(System.in).nextInt();
            Service.delete(idMovieDel);
        }

        System.out.println(" input 1 for continue! for Exit enter 2");
        int comm = new Scanner(System.in).nextInt();
        if (comm == 1) {
            start();
        } else if (comm == 2) {
            System.exit(0);
        }
    }

}
