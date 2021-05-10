package com.company.TaskDay11;


public class ClassEx {
    public void Method(String str) {
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        MyClass my = new MyClass();
        my.Method(null);

    }
}
 class MyClass{
    public void Method( String str) {
        System.out.println(str);
    }
}