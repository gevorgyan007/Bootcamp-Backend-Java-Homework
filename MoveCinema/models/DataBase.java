package com.company.MoveCinema.models;

import com.company.MoveCinema.Move.Director;
import com.company.MoveCinema.Move.Move;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static final List<Move> moves = new ArrayList<>();
    private static final List<Director> directors = new ArrayList<>();

    public DataBase() {
    }

    public static void add(Move move) {
        moves.add(move);
    }
    public static void addDirector(Director director) {
        directors.add(director);
    }
    public static Director getDirector(int index) {
        return directors.get(index);
    }
    public static Move get(int index) {
        return moves.get(index);
    }

    public static void remove(int index) {
        moves.remove(index);
    }

    public static void updateTitle(int idMoveUpdate, String title) {
        moves.get(idMoveUpdate).setTitle(title);
    }

    public static void updateDirector(int idMoveUpdate, int directorId) {
        moves.get(idMoveUpdate).setDirectorFirstName(directors.get(directorId).getFirstNameOfDirector());
        moves.get(idMoveUpdate).setDirectorLastName(directors.get(directorId).getLastNameOfDirector());
        moves.get(idMoveUpdate).setDirectorYear(directors.get(directorId).getYearOfDirector());
    }

    public static void updateYear(int idMoveUpdate, int year) {
        moves.get(idMoveUpdate).setYear(year);
    }

    public static void updateAllMoveField(int idMoveUpdate, String title, int directorId, int year,String genre) {
        moves.get(idMoveUpdate).setTitle(title);
        moves.get(idMoveUpdate).setDirectorFirstName(directors.get(directorId).getFirstNameOfDirector());
        moves.get(idMoveUpdate).setDirectorLastName(directors.get(directorId).getLastNameOfDirector());
        moves.get(idMoveUpdate).setDirectorYear(directors.get(directorId).getYearOfDirector());
        moves.get(idMoveUpdate).setYear(year);
        moves.get(idMoveUpdate).setGenre(genre);
    }

    public static int size() {
        return moves.size();
    }

    public static String gtoString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < moves.size(); i++) {
            result.append(moves.get(i));
            if (i < moves.size() - 1) {
                result.append(", ");
                if (i%2==0)
                    result.append("\n");
            }
        }
        result.append("]");
        return result.toString();
    }
}
