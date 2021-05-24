package com.company.taskday21.CoffeMachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input DrynType");
        String drinkType = scanner.next();
        Command command = new Command(drinkType);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeProduct();

    }

}
