package com.company.VendingMachineTwo.Controller;

import com.company.VendingMachineTwo.Products.Product;
import com.company.VendingMachineTwo.Products.utility.Command;
import com.company.VendingMachineTwo.VendingMachine;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public  static void start(){
        System.out.println("Enter your product");
        Scanner scanner = new Scanner(System.in);

        VendingMachine vendingMachine =null;
       File file = new File("vending_machine.txt");
       if (!file.exists()) {
           try {
               file.createNewFile();
               vendingMachine = new VendingMachine();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }else {
           try (FileInputStream inputFile = new FileInputStream(file)) {
               if (inputFile.available() != 0) {
                   ObjectInputStream objectInputStream = new ObjectInputStream(inputFile);
                   vendingMachine = (VendingMachine) objectInputStream.readObject();
               }
           } catch (FileNotFoundException e) {
               e.printStackTrace();
           } catch (IOException e) {
               e.printStackTrace();
           } catch (ClassNotFoundException e) {
               e.printStackTrace();
           }
       }
       String input = scanner.next();
        while (!input.equals("0")) {
            Command command = new Command(input);
            List<Product> list = Arrays.asList(vendingMachine.giveProduct(command));
            System.out.println(list);
            try (FileOutputStream fileInputStream = new FileOutputStream(file);
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileInputStream);) {

                objectOutputStream.writeObject(vendingMachine);
            } catch (IOException e) {
                e.printStackTrace();
            }
            start();
        }



    }

}
