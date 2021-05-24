package com.company.TaskDay17_encapsulation;

import java.util.Scanner;

public class Triangle {
    //has a sideA, sideB, sideC
    private int sideA;
    private int sideB;
    private int sideC;

    // write getters and setters for that
    // all sides must be in range 1 - 20
    public Triangle() {

    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {

        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA > 1 && sideA < 20) {
            this.sideA = sideA;
        } else {
            System.out.println("invalid value");
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB > 1 && sideB < 20) {
            this.sideB = sideB;
        } else {
            System.out.println("invalid value");
        }

    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC > 1 && sideC < 20) {
            this.sideC = sideC;
        } else {
            System.out.println("invalid value");
        }
    }

    //also your class must have an isTriangleValid() private method.
    private boolean isTriangleValid() {
        if (this.sideA + this.sideB > this.sideC ||
                this.sideA + this.sideC > this.sideB ||
                this.sideC + this.sideB > this.sideA) {
            return true;
        }
        return false;
    }

    //and also a public check() method which will get as a parameter triangle object and will call isValidTriangle() method.
    public boolean check(Triangle triangle) {
        if (triangle.isTriangleValid())
            return true;
        return false;
    }

    private boolean isRightTriangle(Triangle tr) {
        if (tr.isTriangleValid()) {
            return (tr.sideA * tr.sideA + tr.sideB * tr.sideB == tr.sideC * tr.sideC) ||
                    (tr.sideB * tr.sideB + tr.sideC * tr.sideC == tr.sideA * tr.sideA) ||
                    (tr.sideA * tr.sideA + tr.sideC * tr.sideC == tr.sideB * tr.sideB);
        }
        return false;
    }

    public void squareTriangle(Triangle triangle) {
        double perimeter = sideA + sideA + sideC;
        double p = perimeter / 2;
        System.out.println("enter 1 for square  2 for perimeter");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println(Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)));
        } else if (num == 2) {
            System.out.println(perimeter);
        }
    }
}
