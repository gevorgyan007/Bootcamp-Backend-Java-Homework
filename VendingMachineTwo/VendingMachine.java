package com.company.VendingMachineTwo;


import com.company.VendingMachineTwo.Products.Chips.Doritos;
import com.company.VendingMachineTwo.Products.Chips.Lays;
import com.company.VendingMachineTwo.Products.Chips.Pringles;
import com.company.VendingMachineTwo.Products.Chips.Ruffles;
import com.company.VendingMachineTwo.Products.Chocolate.Bounty;
import com.company.VendingMachineTwo.Products.Chocolate.KitKat;
import com.company.VendingMachineTwo.Products.Chocolate.Snickers;
import com.company.VendingMachineTwo.Products.Chocolate.Twix;
import com.company.VendingMachineTwo.Products.Drinks.CocaCola;
import com.company.VendingMachineTwo.Products.Drinks.Fanta;
import com.company.VendingMachineTwo.Products.Drinks.Pepsi;
import com.company.VendingMachineTwo.Products.Drinks.Sprite;
import com.company.VendingMachineTwo.Products.Product;
import com.company.VendingMachineTwo.Products.Sandwich.ChickenCheese;
import com.company.VendingMachineTwo.Products.utility.Command;

import java.io.Serializable;
import java.util.*;

public  class VendingMachine implements Serializable {
    private static final HashMap<String, List<Queue<Product>>> hashMap = new HashMap<>();
   private static final List<Queue<Product>> listSandwich = new LinkedList<>();
   private static final List<Queue<Product>> listChips = new LinkedList<>();
   private static final List<Queue<Product>> listChocolate = new LinkedList<>();
   private static final List<Queue<Product>> listDrinks = new LinkedList<>();

    public VendingMachine() {
        setSandwichType();
        setChipsType();
        setDrinksType();
        SetChocolateType();
        fillVendingMachine();
    }

    public void giveProduct(Command command) {

        Product[] products = new Product[command.getCountProduct()];

        if (command.getProductType().equals("A")) {
            Queue<Product> drinks = hashMap.get("A").get(command.getColNumber()-1);
            for (int i = 0; i < products.length; i++) {
                products[i] = drinks.poll();
            }
        }
        if (command.getProductType().equals("B")) {
            Queue<Product> chips = hashMap.get("B").get(command.getColNumber()-1);
            for (int i = 0; i < products.length; i++) {
                products[i] = chips.poll();
            }
        }
        if (command.getProductType().equals("C")) {
             Queue<Product> chocolate = hashMap.get("C").get(command.getColNumber()-1);
            for (int i = 0; i < products.length; i++) {
                products[i] = chocolate.poll();
            }
        }
        if (command.getProductType().equals("D")) {
            Queue<Product> sandwich = hashMap.get("D").get(command.getColNumber()-1);
            for (int i = 0; i < products.length; i++) {
                products[i] = sandwich.poll();
            }
        }
        System.out.println(Arrays.toString(products));
    }


    private void fillVendingMachine() {
        hashMap.put("A", listDrinks);
        hashMap.put("B", listChips);
        hashMap.put("C", listChocolate);
        hashMap.put("D", listSandwich);
    }

    private void setSandwichType() {


        Queue<Product> chickenCheese = new LinkedList<>();
        Queue<Product> combination = new LinkedList<>();
        Queue<Product> hamSwiss = new LinkedList<>();
        Queue<Product> tunSalad = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            chickenCheese.add(new ChickenCheese("ChickenCheese"));
            combination.add(new Lays("combination"));
            hamSwiss.add(new Pringles("hamSwiss"));
            tunSalad.add(new Ruffles("tunSalad"));
        }
        listSandwich.add(chickenCheese);
       listSandwich.add(combination);
       listSandwich.add(hamSwiss);
       listSandwich.add(tunSalad);
    }

    private void  setChipsType() {

        Queue<Product> doritos = new LinkedList<>();
        Queue<Product> lays = new LinkedList<>();
        Queue<Product> pringles = new LinkedList<>();
        Queue<Product> ruffles = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            doritos.add(new Doritos("Doritos"));
            lays.add(new Lays("Lays"));
            pringles.add(new Pringles("Pringles"));
            ruffles.add(new Ruffles("Ruffles"));
        }
        listChips.add(doritos);
       listChips.add(lays);
       listChips.add(pringles);
       listChips.add(ruffles);

    }

    private void SetChocolateType() {

        Queue<Product> bounty = new LinkedList<>();
        Queue<Product> kitKat = new LinkedList<>();
        Queue<Product> snickers = new LinkedList<>();
        Queue<Product> twix = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            bounty.add(new Bounty("Bounty"));
            kitKat.add(new KitKat("Kitkat"));
            snickers.add(new Snickers("Snickers"));
            twix.add(new Twix("Twix"));
        }
        listChocolate.add(bounty);
       listChocolate.add(kitKat);
       listChocolate.add(snickers);
       listChocolate.add(twix);
    }

    private void setDrinksType() {
        Queue<Product> coca = new LinkedList<>();
        Queue<Product> fanta = new LinkedList<>();
        Queue<Product> sprite = new LinkedList<>();
        Queue<Product> pepsi = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            coca.add(new CocaCola("CocaCola"));
            fanta.add(new Fanta("Fanta"));
            sprite.add(new Sprite("Sprite"));
            pepsi.add(new Pepsi("Pepsi"));
        }
        listDrinks.add(coca);
        listDrinks.add(fanta);
        listDrinks.add(sprite);
        listDrinks.add(pepsi);
    }


}
