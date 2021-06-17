package com.company.VendingMachineTwo.Controller;

import com.company.VendingMachineTwo.Products.utility.Command;
import com.company.VendingMachineTwo.VendingMachine;

import java.io.*;
import java.util.Scanner;

public class Controller {
    public static void start() {
        System.out.println("Enter your product");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Command command = new Command(input);

        VendingMachine vendingMachine = null;
        String path = "C:\\Users\\Taron\\Desktop\\Aca_Bootcamp_Task\\src\\com\\company\\VendingMachineTwo\\DB\\VMDB.txt";
        File file = new File(path);
        if (!file.exists() || file.length() == 0) {
            try {
                file.createNewFile();
                vendingMachine = new VendingMachine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            vendingMachine = deSerializer(vendingMachine, file);
        }

       vendingMachine.giveProduct(command);
        serializer(vendingMachine, file);
    }

    private static VendingMachine deSerializer(VendingMachine vendingMachine, File file) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
                vendingMachine = (VendingMachine) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return vendingMachine;
    }

    private static void serializer(VendingMachine vendingMachine, File file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(vendingMachine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
