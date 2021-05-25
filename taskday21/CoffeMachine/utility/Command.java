package com.company.taskday21.CoffeMachine.utility;

public class Command {
    private int sugarQount;
    private DrinkType drinkType;
    private String commandField;

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
            throw new IllegalArgumentException("You enter invalid input");
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
