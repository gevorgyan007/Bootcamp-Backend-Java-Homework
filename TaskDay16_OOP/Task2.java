package com.company.TaskDay16_OOP;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop("praductMarcet","baghramyan 8",8,1000,0);
        int num;
        shop.Print();
        System.out.println("Please enter count of order");
        int countpr =scanner.nextInt();
        if (shop.checkOrder(countpr)) {
            System.out.println("if you want to buy it, Please press 1 , if you don’t want to buy it press any bottom");
            num = scanner.nextInt();
            if (num == 1){
             shop.addToShopBalance(shop.calculateOrder(countpr));
             shop.countOfProduct-= countpr;
            }
        }else{
            System.out.println("Now we don’t have so much product,sorry");
        }
        shop.Print();

        }
    }
