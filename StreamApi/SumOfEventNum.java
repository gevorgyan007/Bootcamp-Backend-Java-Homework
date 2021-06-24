package com.company.StreamApi;

import java.util.ArrayList;
import java.util.Random;

public class SumOfEventNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(10));
        }
        System.out.println(list);

       // Integer sumOfEven = list.stream().filter(each -> (each % 2) == 0).reduce(Integer::sum).get();
        int sum = list.stream().filter(each -> (each % 2) == 0).mapToInt(x -> x).peek(e -> System.out.println("element " + e)).sum();
        System.out.println(sum);
    }
}
