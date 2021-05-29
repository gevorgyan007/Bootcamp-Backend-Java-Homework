package com.company.VendingMachine.utility;

public class Command {

    private String command;
    private int countProduct;
    private int numberCol;
    private ProductType productType;

    private DrinkType drinkType;
    private ChipsType chipsType;
    private ChocoType chocoType;
    private SandwichType sandwichType;

    public Command() {
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public ChipsType getChipsType() {
        return chipsType;
    }

    public ChocoType getChocoType() {
        return chocoType;
    }

    public SandwichType getSandwichType() {
        return sandwichType;
    }

    public int getCountProduct() {
        return countProduct;
    }

    public int getNumberCol() {
        return numberCol;
    }

    public ProductType getProductType() {
        return productType;
    }

    @Override
    public String toString() {
        return "Command{" +
                "command='" + command + '\'' +
                ", countProduct=" + countProduct +
                ", numberCol=" + numberCol +
                ", productType=" + productType +
                ", drinkType=" + drinkType +
                ", chipsType=" + chipsType +
                ", chocoType=" + chocoType +
                ", sandwichType=" + sandwichType +
                '}';
    }

    public Command(String command) {
        this.command = command;
        split();
        setProductTypes();
    }

    private void split() {
        String[] comm = this.command.split(":");
        switch (comm[0]) {
            case "A" -> productType = ProductType.DRINKS;
            case "B" -> productType = ProductType.CHIPS;
            case "C" -> productType = ProductType.CHOCOLATE;
            case "D" -> productType = ProductType.SANDWICH;
        }
        numberCol = Integer.parseInt(comm[1]);
        countProduct = Integer.parseInt(comm[2]);
    }

    private void setProductTypes() {
        setDrinkType();
        SetChipsType();
        setChocoType();
        setSandwichType();
    }

    private void setSandwichType() {
        if (numberCol == 1 && productType == ProductType.SANDWICH) {
            sandwichType = SandwichType.Combination;
        } else if (numberCol == 2 && productType == ProductType.SANDWICH) {
            sandwichType = SandwichType.HamSwiss;
        } else if (numberCol == 3 && productType == ProductType.SANDWICH) {
            sandwichType = SandwichType.ChickenCheese;
        } else if (numberCol == 4 && productType == ProductType.SANDWICH) {
            sandwichType = SandwichType.TunaSalad;
        }
    }

    private void setChocoType() {
        if (numberCol == 1 && productType == ProductType.CHOCOLATE) {
            chocoType = ChocoType.Bounty;
        } else if (numberCol == 2 && productType == ProductType.CHOCOLATE) {
            chocoType = ChocoType.KitKat;
        } else if (numberCol == 3 && productType == ProductType.CHOCOLATE) {
            chocoType = ChocoType.Snickers;
        } else if (numberCol == 4 && productType == ProductType.CHOCOLATE) {
            chocoType = ChocoType.Twix;
        }
    }

    private void SetChipsType() {
        if (numberCol == 1 && productType == ProductType.CHIPS) {
            chipsType = ChipsType.Doritos;
        } else if (numberCol == 2 && productType == ProductType.CHIPS) {
            chipsType = ChipsType.Lays;
        } else if (numberCol == 3 && productType == ProductType.CHIPS) {
            chipsType = ChipsType.Pringles;
        } else if (numberCol == 4 && productType == ProductType.CHIPS) {
            chipsType = ChipsType.Ruffles;
        }
    }

    private void setDrinkType() {
        if (numberCol == 1 && productType == ProductType.DRINKS) {
            drinkType = DrinkType.CocaCola;
        } else if (numberCol == 2 && productType == ProductType.DRINKS) {
            drinkType = DrinkType.Fanta;
        } else if (numberCol == 3 && productType == ProductType.DRINKS) {
            drinkType = DrinkType.Pepsi;
        } else if (numberCol == 4 && productType == ProductType.DRINKS) {
            drinkType = DrinkType.Sprite;
        }
    }
}
