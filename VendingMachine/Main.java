package com.company.VendingMachine;

import com.company.VendingMachine.Product.Product;
import com.company.VendingMachine.utility.Command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your product");
        Command command = new Command(scanner.next());
        //System.out.println(command.toString());
        VendingMachine vendingMachine = new VendingMachine();
        Product[] product = vendingMachine.giveProduct(command);
        System.out.println("PLEASE TAKE YOUR PRODUCT");
        for (int i = 0; i < product.length; i++) {
            System.out.print( product[i].toString() +"-->" );
        }
        System.out.print("|");
    }
}
