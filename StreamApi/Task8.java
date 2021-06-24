package com.company.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Xcho",18,"Armian"));
        personList.add(new Person("Hovo",25,"American"));
        personList.add(new Person("Sam",35,"Gorgian"));
        personList.add(new Person("Sahak",11,"Armian"));
        personList.add(new Person("Vardan",05,"Gorgian"));
        personList.add(new Person("Karen",55,"American"));
        personList.add(new Person("Armen",06,"Armian"));
        Map<String, List<Person>> collect = personList.stream().collect(Collectors.groupingBy(e -> e.getNationality()));
        System.out.println(collect);
    }
}
