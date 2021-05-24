package com.company.TaskDay12;

public class Task6 {
    //Write a square() method, which
    //if get one  int parameter returns the square of circle
    //if get one float parameter returns the square of square
    //if get 2 parameters returns the square of rectangle
    public static int square(int r){
        return (int)(Math.PI * r*r);
    }
    public static float square(float r){
        return (float) (Math.PI * r*r);
    }
    public static float square(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {

    }
}
