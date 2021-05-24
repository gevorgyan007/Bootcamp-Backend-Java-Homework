package com.company.taskday21.CoffeMachine;

import com.company.taskday21.CoffeMachine.models.*;
import com.company.taskday21.CoffeMachine.utility.Command;
import com.company.taskday21.CoffeMachine.utility.DrinkType;

public class CoffeeMachine {

    public Cup makeProduct(Command cmd){

        Cup cup = new Cup();
        setDrinkType(cmd, cup);
        setStick(cmd, cup);
        setSuger(cmd, cup);
        return cup;
        }

    private void setDrinkType(Command cmd, Cup cup) {
        if(cmd.getDrinkType() == DrinkType.Tea ){
            Tea tea = new Tea();
            cup.setDrink(tea);
        }else if (cmd.getDrinkType() == DrinkType.Coffee){
            Coffee coffee = new Coffee();
            cup.setDrink(coffee);
        }else if (cmd.getDrinkType() == DrinkType.Chocolate){
            Chocolate chocolate = new Chocolate();
            cup.setDrink(chocolate);
        }
    }

    private void setStick(Command cmd, Cup cup) {
        if (cmd.getSugarQount()>0){
            cup.setStick(new Stick());
        }
    }

    private void setSuger(Command cmd, Cup cup) {
        if (cmd.getSugarQount()>0){
            Sugar[] sug = new Sugar[cmd.getSugarQount()];
            cup.setSugars(sug);
        }
    }




}
