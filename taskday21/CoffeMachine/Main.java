package com.company.taskday21.CoffeMachine;

import com.company.taskday21.CoffeMachine.models.Cup;
import com.company.taskday21.CoffeMachine.utility.Command;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input DrinkType");
        Command command = new Command(scanner.next());

        String str = command.toString();
        System.out.println(str);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Cup cup = coffeeMachine.makeProduct(command);

        System.out.println(cup.toString());
    }

}
