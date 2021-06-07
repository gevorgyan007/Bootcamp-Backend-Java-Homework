package com.company.task22;

import java.util.ArrayList;

public class Task4 {
    public  static ArrayList join(ArrayList obj1,ArrayList obj2){

            obj1.addAll(obj2);
            return  obj1;

    }
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        integers1.add(5);
        System.out.println(join(integers1,integers));
    }
}
