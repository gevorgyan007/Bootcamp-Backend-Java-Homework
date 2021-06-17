package com.company.VendingMachineTwo.Products;

import java.io.Serializable;

public abstract class Product implements Serializable {
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
