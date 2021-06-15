package com.company.VendingMachineTwo.Products;

public abstract class Product {
    private String name;

    @Override
    public String toString() {
        return name ;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
