package com.company.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vahag",18));
        personList.add(new Person("Armen",35));
        personList.add(new Person("Taron",25));
        personList.add(new Person("Sam",15));
        personList.add(new Person("Vaxarsh",5));

        List<Person> collect = personList.stream().filter(e -> (e.getAge() < 18)).collect(Collectors.toList());
        List<Person> collect1 = personList.stream().filter(e -> (e.getAge() > 18)).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
    }
}
