package com.company.VendingMachine.Product.drinks;

public class CocaCola extends Drinks {
    public CocaCola() {
        this.setName("CocaCola");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
