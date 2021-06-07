package com.company.task22;

import java.util.ArrayList;

public class Task6 {
    public static void capacityTrim(ArrayList obj){
        obj.trimToSize();
    }
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5555);
        integers.add(25646);
        integers.add(3);
        integers.add(544);
        integers.add(5);
        capacityTrim(integers);
        System.out.println();
    }
}
