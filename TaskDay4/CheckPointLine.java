package com.company.TaskDay4;

public class CheckPointLine {
    public static void main(String[] args) {
        int co1 = 1, co2 = 7;
        if (co1 > 0 && co2 > 0) {
            System.out.println("The coordinate point  lies in the First quandrant");
        } else if (co1 < 0 && co2 > 0) {
            System.out.println("The coordinate point lies in the Second quandrant.");
        } else if (co1 < 0 && co2 < 0) {
            System.out.println("The coordinate point lies in the Third quandrant");
        } else if (co1 > 0 && co2 < 0) {
            System.out.println("The coordinate pointlies in the Fourth quandrant");
        } else if (co1 == 0 && co2 == 0) {
            System.out.println("The coordinate point  lies at the origin.");
        }
    }
}

