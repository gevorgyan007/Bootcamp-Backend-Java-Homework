package com.company.task22;

import java.util.ArrayList;

public class task1 {
    public static ArrayList  reverse(ArrayList obj){
        int j = obj.size()-1;
        Object val;
        for (int i = 0; i < j; i++) {
            val = obj.get(i);
            obj.set(i,obj.get(j));
            obj.set(j,val);
            j--;
        }
        return obj;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        System.out.println(integers);
        System.out.println(reverse(integers));

    }
}
