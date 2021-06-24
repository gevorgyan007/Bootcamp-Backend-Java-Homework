package com.company.Example;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    static int sum = 0;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            list.add(i);
        }

        list.forEach(item -> sum+= item);
        System.out.println(sum);

      // Consumer<Integer> lamda = (number) -> {
      //     if (number > max)
      //         max = number;
      //     if (number < min)
      //         min = number;
      //     sum += number;
      // };
      // list.forEach(lamda);
      // System.out.println(sum);
      // System.out.println(max);
      // System.out.println(min);
    }
}
interface my {

}
