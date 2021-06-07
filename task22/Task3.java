package com.company.task22;

import java.util.ArrayList;

public class Task3 {
    public static ArrayList swap(int index1,int index2,ArrayList obj){
        Object temp = obj.get(index1);
        obj.set(index1,obj.get(index2));
        obj.set(index2,temp);
        return obj;
    }
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        System.out.println(swap(1, 3, integers));
    }
}
