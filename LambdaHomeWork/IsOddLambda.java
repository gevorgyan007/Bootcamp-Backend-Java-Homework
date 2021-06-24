package com.company.LambdaHomeWork;

import java.util.function.Predicate;

//PerformOperation isOdd(): The lambda expression must return  if a number is odd or  if it is even.
public class IsOddLambda {


    public static void main(String[] args) {
        //1.
        long l1 = System.nanoTime();
        Predicate<Integer> lambdaIsOdd = (number) -> number % 2 == 0;

        System.out.println(lambdaIsOdd.test(13));
        long l2 = System.nanoTime();

        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
              return integer % 2 == 0;
            }
        };
        System.out.println(p.test(487));
        //2.

    }
    }

