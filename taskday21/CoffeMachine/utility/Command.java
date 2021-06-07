package com.company.taskday21.CoffeMachine.utility;

import java.util.Scanner;

public class Command {
    private int sugarQount;
    private String commandField;
    private DrinkType drinkType;

    @Override
    public String toString() {
        return "Command{" +
                "sugarQount=" + sugarQount +
                ", drinkType=" + drinkType +
                ", commandField='" + commandField + '\'' +
                '}';
    }

    public int getSugarQount() {
        return sugarQount;
    }

    public void setSugarQount(int sugarQount) {
        this.sugarQount = sugarQount;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public Command() {

    }

    public Command(String commandField) {
        if (checkVal(commandField)) {
            this.commandField = commandField;
            this.Split();
        } else {
            try {
                throw  new InvalidInputException("Invalid Input format");
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());

                // e.MyExceptionMethod();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please input DrinkType");
                Command command = new Command(scanner.next());
            }
        }
    }

    private boolean checkVal(String str) {
        if (str.length() == 3) {
            if (str.charAt(0) == 'T' || str.charAt(0) == 'C' || str.charAt(0) == 'S' && str.charAt(1) == ':') {
                if (str.charAt(2) <= '9' && str.charAt(2) >= '0') {
                    return true;
                }
            }
        }
        return false;
    }

    private void Split() {
        String str = this.commandField;
        String[] split = str.split(":");

        if (split[0].equalsIgnoreCase("T")) {
            drinkType = DrinkType.Tea;
        }
        if (split[0].equalsIgnoreCase("S")) {
            drinkType = DrinkType.Chocolate;
        } else if (split[0].equalsIgnoreCase("C")) {
            drinkType = DrinkType.Coffee;
        }
        sugarQount = Integer.parseInt(split[1]);
    }
}
