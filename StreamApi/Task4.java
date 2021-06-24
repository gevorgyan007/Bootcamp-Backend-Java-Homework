package com.company.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vahag",18));
        personList.add(new Person("Armen",35));
        personList.add(new Person("Taron",25));
        personList.add(new Person("Sam",21));
        personList.add(new Person("Vaxarsh",55));

        Person max = personList.stream().max(Comparator.comparing(e -> e.getAge())).get();
        System.out.println(max);


    }
}



