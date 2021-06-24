package com.company.StreamApi;

import java.util.ArrayList;
import java.util.Random;

public class SumOfColl {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(10));
        }
        System.out.println(list);
        //1.
        Integer sumColl = list.stream().reduce((sum, item) -> sum + item).get();
        //Integer sumColl = list.stream().mapToInt(e ->e).sum();
        System.out.println(sumColl);
    }
}
