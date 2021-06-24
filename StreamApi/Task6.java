package com.company.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vahag",18));
        personList.add(new Person("Armen",5));
        personList.add(new Person("Taron",25));
        personList.add(new Person("Sam",10));
        personList.add(new Person("Vaxarsh",55));

        List<String> collect = personList.stream().filter(e -> e.getAge() < 18).map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
