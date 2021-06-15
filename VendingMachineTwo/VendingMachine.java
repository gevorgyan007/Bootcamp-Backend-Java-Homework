package com.company.VendingMachineTwo;


import com.company.VendingMachineTwo.Products.Chips.Doritos;
import com.company.VendingMachineTwo.Products.Chips.Lays;
import com.company.VendingMachineTwo.Products.Chips.Pringles;
import com.company.VendingMachineTwo.Products.Chips.Ruffles;
import com.company.VendingMachineTwo.Products.Chocolate.Bounty;
import com.company.VendingMachineTwo.Products.Chocolate.KitKat;
import com.company.VendingMachineTwo.Products.Chocolate.Snickers;
import com.company.VendingMachineTwo.Products.Chocolate.Twix;
import com.company.VendingMachineTwo.Products.Drinks.*;
import com.company.VendingMachineTwo.Products.Product;
import com.company.VendingMachineTwo.Products.Sandwich.ChickenCheese;
import com.company.VendingMachineTwo.Products.utility.Command;

import java.io.Serializable;
import java.util.*;

public class VendingMachine implements Serializable {
    private static final HashMap<String, List<Queue<Product>>> hashMap = new HashMap<>();

    public VendingMachine() {
        fillVendingMachine();
    }

    public Product[] giveProduct(Command command) {
        Object[] keysOfMap = hashMap.keySet().toArray();

        Product[] products = new Product[command.getCountProduct()];
        getDrinks(command, keysOfMap, products);
        getChipses(command, keysOfMap, products);
        getChocolates(command, keysOfMap, products);
        getSandwiches(command, keysOfMap, products);
        return products;
    }

    private void getSandwiches(Command command, Object[] keysOfMap, Product[] products) {
        if (command.getProductType().equals(keysOfMap[3])){
            List<Queue<Product>> listSandwich = hashMap.get(keysOfMap[3]);
            if (command.getColNumber() == 1){
                Queue<Product> productChickenCheese =listSandwich.get(0);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productChickenCheese.poll();
                }
            }else if (command.getColNumber() == 2){
                Queue<Product> productsCombination = listSandwich.get(1);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productsCombination.poll();
                }
            }else if (command.getColNumber() == 3){
                Queue<Product> productsHamSwiss= listSandwich.get(2);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productsHamSwiss.poll();
                }
            }else if (command.getColNumber() == 4){
                Queue<Product> productTunSalad= listSandwich.get(3);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productTunSalad.poll();
                }
            }
        }
    }

    private void getChocolates(Command command, Object[] keysOfMap, Product[] products) {
        if (command.getProductType().equals(keysOfMap[2])){
            List<Queue<Product>> listChocolate = hashMap.get(keysOfMap[2]);
            if (command.getColNumber() == 1){
                Queue<Product> productsBounty= listChocolate.get(0);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productsBounty.poll();
                }
            }else if (command.getColNumber() == 2){
                Queue<Product> productsKitKat = listChocolate.get(1);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productsKitKat.poll();
                }
            }else if (command.getColNumber() == 3){
                Queue<Product> productsSnickers= listChocolate.get(2);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productsSnickers.poll();
                }
            }else if (command.getColNumber() == 4){
                Queue<Product> productsTwix= listChocolate.get(3);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productsTwix.poll();
                }
            }
        }
    }

    private void getChipses(Command command, Object[] keysOfMap, Product[] products) {
        if (command.getProductType().equals(keysOfMap[1])){
            List<Queue<Product>> listChips = hashMap.get(keysOfMap[1]);
            if (command.getColNumber() == 1){
                Queue<Product> productsDoritos = listChips.get(0);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productsDoritos.poll();
                }
            }else if (command.getColNumber() == 2){
                Queue<Product> productsLays = listChips.get(1);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productsLays.poll();
                }
            }else if (command.getColNumber() == 3){
                Queue<Product> productsPringles= listChips.get(2);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productsPringles.poll();
                }
            }else if (command.getColNumber() == 4){
                Queue<Product> productsRuffles= listChips.get(3);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productsRuffles.poll();
                }
            }
        }
    }

    private void getDrinks(Command command, Object[] keysOfMap, Product[] products) {
        if (command.getProductType().equals(keysOfMap[0])) {
            List<Queue<Product>> listDrink = hashMap.get(keysOfMap[0]);
            if (command.getColNumber() == 1) {
                Queue<Product> productsCoca = listDrink.get(0);
                for (int i = 0; i < command.getCountProduct(); i++) {
                   products[i] = productsCoca.poll();
                }
            }else if (command.getColNumber() == 2){
                Queue<Product> productFanta = listDrink.get(1);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productFanta.poll();
                }
            }else if (command.getColNumber() == 3){
                Queue<Product> productSprint= listDrink.get(2);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productSprint.poll();
                }
            }else if (command.getColNumber() == 4){
                Queue<Product> productPepsi= listDrink.get(3);
                for (int i = 0; i < command.getCountProduct(); i++) {
                    products[i] = productPepsi.poll();
                }
            }
        }
    }


    private void fillVendingMachine() {
        List<Queue<Product>> listDrinks = setDrinksType();
        List<Queue<Product>> listChips = setChipsType();
        List<Queue<Product>> listChocolate = SetChocolateType();
        List<Queue<Product>> listSandwich = setSandwichType();
        hashMap.put("A", listDrinks);
        hashMap.put("B", listChips);
        hashMap.put("C", listChocolate);
        hashMap.put("D", listSandwich);
    }

    private List<Queue<Product>> setSandwichType() {
        List<Queue<Product>> listSandwich = new LinkedList<>();
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
        return listSandwich;
    }

    private List<Queue<Product>> setChipsType() {
        List<Queue<Product>> listChips = new LinkedList<>();
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
        return listChips;
    }

    private List<Queue<Product>> SetChocolateType() {
        List<Queue<Product>> listChocolate = new LinkedList<>();
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
        return listChocolate;
    }

    private List<Queue<Product>> setDrinksType() {
        List<Queue<Product>> listDrinks = new LinkedList<>();
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
        return listDrinks;
    }


}
