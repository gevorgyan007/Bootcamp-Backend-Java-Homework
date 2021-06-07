package com.company.VendingMachine;

import com.company.VendingMachine.Product.Chips.*;
import com.company.VendingMachine.Product.Product;
import com.company.VendingMachine.Product.chocolate.*;
import com.company.VendingMachine.Product.drinks.CocaCola;
import com.company.VendingMachine.Product.drinks.Drinks;
import com.company.VendingMachine.Product.drinks.*;
import com.company.VendingMachine.Product.sandwich.*;
import com.company.VendingMachine.utility.*;


public class VendingMachine {
    
    Stack<Product>[] stacks = new Stack[16];
    public VendingMachine() {

    }

  //private void InsertProduct(){
  //    for (int i = 0; i < stacks.length; i++) {
  //        for (int j = 0; j <20 ; j++) {
  //
  //        }
  //    }
  //}


    public Product[] giveProduct(Command command){
        Product[] products = new Product[command.getCountProduct()];
        setDrinksProduct(command, products);
        setChipsProduct(command, products);
        setChocoProduct(command, products);
        setsandwichProduct(command, products);
        return  products;
    }

    private void setsandwichProduct(Command command, Product[] products) {
        if (command.getProductType() == ProductType.SANDWICH) {
            for (int j = 0; j < 4; j++) {
                if (command.getSandwichType() == SandwichType.values()[j]) {
                    stacks[j] = new Stack<Product>();
                    Sandwich[] sandwiches = new Sandwich[]{new ChickenCheese(),new Combination(),new HamSwiss(),new TunaSalad()};
                    for (int i = 0; i < 20; i++) {
                        stacks[j].push(sandwiches[j]);
                    }
                    if (stacks[j].size() > 0) {
                        for (int i = 0; i < command.getCountProduct(); i++) {
                            products[i] = stacks[j].pop();
                        }
                    } else {
                        throw new IllegalArgumentException("invalid countOfProduct");
                    }
                    break;
                }
            }
        }
    }

    private void setChocoProduct(Command command, Product[] products) {
        if (command.getProductType() == ProductType.CHOCOLATE) {
            for (int j = 0; j < 4; j++) {
                if (command.getChocoType() == ChocoType.values()[j]) {
                    stacks[j] = new Stack<Product>();
                    Chocolate[] chocolates = new Chocolate[]{new Bounty(),new KitKat(),new Snickers(),new Twix()};
                    for (int i = 0; i < 20; i++) {
                        stacks[j].push(chocolates[j]);
                    }
                    if (stacks[j].size() > 0) {
                        for (int i = 0; i < command.getCountProduct(); i++) {
                            products[i] = stacks[j].pop();
                        }
                    } else {
                        throw new IllegalArgumentException("invalid countOfProduct");
                    }
                    break;
                }
            }
        }
    }

    private void setChipsProduct(Command command, Product[] products) {
        if (command.getProductType() == ProductType.CHIPS) {
            for (int j = 0; j < 4; j++) {
                if (command.getChipsType() == ChipsType.values()[j]) {
                    stacks[j] = new Stack<Product>();
                    Chips[] chips = new Chips[]{new Doritos(),new Lays(),new Pringles(),new Ruffles()};
                    for (int i = 0; i < 20; i++) {
                        stacks[j].push(chips[j]);
                    }
                    if (stacks[j].size() > 0) {
                        for (int i = 0; i < command.getCountProduct(); i++) {
                            products[i] = stacks[j].pop();
                        }
                    } else {
                        throw new IllegalArgumentException("invalid countOfProduct");
                    }
                    break;
                }
            }
        }
    }

    private void setDrinksProduct(Command command, Product[] products) {
        if (command.getProductType() == ProductType.DRINKS) {
            for (int j = 0; j < 4; j++) {
                if (command.getDrinkType() == DrinkType.values()[j]) {
                    stacks[j] = new Stack<Product>();
                    Drinks[] drinks = new Drinks[]{new CocaCola(),new Fanta(),new Pepsi(),new Sprite()};
                    for (int i = 0; i < 20; i++) {
                        stacks[j].push(drinks[j]);
                    }
                    if (stacks[j].size() > 0) {
                        for (int i = 0; i < command.getCountProduct(); i++) {
                            products[i] = stacks[j].pop();
                        }
                    } else {
                        throw new IllegalArgumentException("invalid countOfProduct");
                    }
                    break;
                }
            }
        }
    }

}
