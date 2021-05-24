package com.company.taskDay19;

public class ProgrammingLanguage implements Ilenguage{
    private String name;

    public ProgrammingLanguage(String name) {
        this.name = name;
    }

    @Override
    public String getName(String name) {
        return name;
    }
}
