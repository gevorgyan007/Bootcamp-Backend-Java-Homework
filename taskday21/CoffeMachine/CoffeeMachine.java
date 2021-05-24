package com.company.taskday21.CoffeMachine;

public class CoffeeMachine {
    Command cmd = new Command();
    public void makeProduct(){
        Drink [] drinks = new  Drink[4];
            switch (cmd.getDrinkType()){
                case Tea:
                        drinks[0] = new Tea();
                        drinks[1] = new Sugar(cmd.getSugarQount());
                        drinks[2] = new Cup();
                        drinks[3] = new Stick();
                    break;
                case Coffee:
                    Drink coffee = new Coffee();
                    Cup cup1 = new Cup();
                    break;
                case Chocolate:
                    Drink chocolate = new Chocolate();
                    Cup cup2 = new Cup();
                   break;
            }
            for (int i = 0; i < drinks.length; i++) {
                System.out.println(drinks[i].toString());
            }
        }
}
