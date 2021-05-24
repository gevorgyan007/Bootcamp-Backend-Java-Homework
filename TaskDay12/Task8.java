package com.company.TaskDay12;

public class Task8 {
        //Write a distance() function which
        //return distance from (0.0 , 0.0) to (a)
        //distance(int x1 , int x2, int x3, int x4) where (x1, x2) are the coordinates of a
        //distance(int, int)
        //return the distance from a to be, if method distance get 4 int parameters
        public static void distance(int x1,int x2){
            System.out.println(Math.sqrt(x1*x1 + x2*x2));
        }
    public static void distance(int x1,int x2,int y1,int y2){
        System.out.println(Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
    }

    public static void main(String[] args) {

    }
}
