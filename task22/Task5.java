package com.company.task22;

import java.util.ArrayList;

public class Task5 {
    public  static ArrayList clon(ArrayList obj1, ArrayList obj2){
        obj1.clear();
        obj1.addAll(obj2);
        return  obj1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5555);
        integers.add(25646);
        integers.add(3);
        integers.add(544);
        integers.add(5);
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        integers1.add(5);
        System.out.println(clon(integers,integers1));
    }
}
