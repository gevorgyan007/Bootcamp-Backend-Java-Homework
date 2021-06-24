package com.company.StreamApi;

import java.util.ArrayList;
import java.util.List;

//Return people names separated by comma
public class Task9 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Xcho", 18, "Armian"));
        personList.add(new Person("Hovo", 25, "American"));
        personList.add(new Person("Sam", 35, "Gorgian"));
        personList.add(new Person("Sahak", 11, "Armian"));
        personList.add(new Person("Vardan", 05, "Gorgian"));
        personList.add(new Person("Karen", 55, "American"));
        personList.add(new Person("Armen", 06, "Armian"));

        String namesList = personList.stream().map(person -> person.getName()).reduce((names, e) -> names + "|" + e).get();
        System.out.println(namesList);

    }
}
