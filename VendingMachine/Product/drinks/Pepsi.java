package com.company.VendingMachine.Product.drinks;

public class Pepsi  extends Drinks {
    public Pepsi() {
        this.setName("Pepsi");
    }
    @Override
    public String toString() {
        return this.getName();
    }
}
