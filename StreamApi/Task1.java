package com.company.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        List<String> collection = Arrays.asList("my","name","is","taron","gevorgyan");
        List<String> collectToUpper = collection.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
        System.out.println(collectToUpper);
    }
}
