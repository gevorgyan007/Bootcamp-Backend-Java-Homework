package com.company.taskday21.CoffeMachine;

public class Command {
    private int sugarQount;
    private DrinkType drinkType;
    private String commandField;

    public int getSugarQount() {
        return sugarQount;
    }

    public Command() {

    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public Command(String commandField) {
        if (checkVal(commandField)) {
            this.commandField = commandField;
            this.Split();
        }
    }



    private boolean checkVal(String str) {
        boolean result = true;
        if (str.length() != 3) {
            result = false;
        } else if (str.charAt(0) != 'T' && str.charAt(1) != 'C' && str.charAt(1) != 'S') {
            result = false;
        }else  if((str.charAt(1) != ':')){
            result = false;
        }
        if (str.charAt(2) > '9' || str.charAt(2) < '0') {
            result = false;
        }
        return result;
    }

    private void Split() {
        String str = this.commandField;
        String[] 
        if(str.charAt(0) =='T'){
        drinkType = DrinkType.Tea ;
        }else if(str.charAt(0) =='S'){
            drinkType = DrinkType.Chocolate ;
        }else if(str.charAt(0) =='C'){
            drinkType = DrinkType.Coffee ;
        }
        sugarQount = Integer.parseInt("" + str.charAt(2));
    }


}
