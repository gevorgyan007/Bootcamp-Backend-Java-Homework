package com.company.Example;

import java.util.ArrayList;
import java.util.List;

public interface Animal {
    void move();
}



class Cat implements  Animal{

    @Override
    public void move() {
        System.out.println("cat moving");
    }
}
class Dog implements  Animal{

    @Override
    public void move() {
        System.out.println("dog moving");
    }
}
class Surren implements  Animal{

    @Override
    public void move() {
        System.out.println("dog moving");
    }
}
class Main1{
    public static void main(String[] args) {
        List<Animal>  animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Surren());




        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).move();
        }
    }
}