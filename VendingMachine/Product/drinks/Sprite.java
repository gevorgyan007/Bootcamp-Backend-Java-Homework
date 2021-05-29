package com.company.VendingMachine.Product.drinks;

public class Sprite extends Drinks{
    public Sprite() {
        this.setName("Sprite");
    }
    @Override
    public String toString() {
        return this.getName();
    }
}
