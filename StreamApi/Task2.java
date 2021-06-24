package com.company.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("my", "name", "is", "taron", "gevorgyan");
        List<String> collect = collection.stream().filter(e -> e.length() < 4).collect(Collectors.toList());
        System.out.println(collect);
    }
}
