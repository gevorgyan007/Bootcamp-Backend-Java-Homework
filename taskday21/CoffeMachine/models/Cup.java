package com.company.taskday21.CoffeMachine.models;

import java.util.Arrays;

public class Cup extends Drink {
    private Drink drink;
    private Stick stick;
    private Sugar[] sugars;

    @Override
    public String toString() {
        return "Cup{" +
                "drink=" + drink +
                ", stick=" + stick +
                ", sugars=" + Arrays.toString(sugars) +
                '}';
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Stick getStick() {
        return stick;
    }

    public void setStick(Stick stick) {
        this.stick = stick;
    }

    public Sugar[] getSugars() {
        return sugars;
    }

    public void setSugars(Sugar[] sugars) {
        this.sugars = sugars;
    }
}
