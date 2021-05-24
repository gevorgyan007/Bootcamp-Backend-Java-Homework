package com.company.TaskDay16_OOP;

public class Employer {
    // name, age, workPlace, salary.
    String name;
    int age;
    String workPlace;
    int salary;

    public Employer() {
    }

    public Employer(int age, String name, String workPlace, int salary) {
        this.age = age;
        this.name = name;
        this.workPlace = workPlace;
        this.salary = salary;
    }

    public void infoemployer() {
        System.out.println("Name " + name + " age " + age + " workPlace " + workPlace + " salary " + salary);
    }

}
