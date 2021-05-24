package com.company.taskDay19;

public class Englishlanguage implements  Ilenguage{
    private String lenguageName;

    public Englishlanguage(String lenguageName) {
        this.lenguageName = lenguageName;
    }

    @Override
    public String getName(String name) {
        return name;
    }
}
