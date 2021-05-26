package com.company.GameOfSoldier;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome game!");
        System.out.println("Please enter your Warrior! \n 1. Swordsmen \n 2. Archer \n 3. Swordsman");
        int input = new Scanner(System.in).nextInt();
        Game game = new Game(input);
    }
}
