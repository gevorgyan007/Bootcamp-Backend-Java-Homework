package com.company.Threads.Wallet;

public class Main extends Thread {

    public static void main(String[] args) {
        Wallet wallet = new Wallet(1000);
        Runnable r1 = () -> {
            while (wallet.getMoney() -50 >0) {
              //  System.out.println("Task1");
                wallet.takeMoney(50);
            }
        };
        Runnable r2 = () -> {
            while (wallet.getMoney()-30 >0) {
              //  System.out.println("Task2");
                wallet.takeMoney(30);
            }
        };
        Runnable r3 = () -> {
            while (wallet.getMoney()-80>0) {
               // System.out.println("Task3");
                wallet.takeMoney(80);
            }
        };
        Thread t1 = new Thread(r1);

        Thread t2 = new Thread(r2);

        Thread t3 = new Thread(r3);

            t1.start();
            t2.start();
            t3.start();

    }
}
