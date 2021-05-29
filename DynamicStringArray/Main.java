package com.company.DynamicStringArray;

public class Main {
    public static void main(String[] args) {
        DynamicStringArray dsa = new DynamicStringArray();
        dsa.add("a");
        dsa.add("add");
        dsa.add("b");
        dsa.add("bad");
        dsa.add("good");
        dsa.add("bad");
        dsa.add("b");
        dsa.add("a");
        dsa.add("asa");
        dsa.add("sss");
        dsa.print();
        System.out.println(dsa.size());
        dsa.remove("asa");
        System.out.println(dsa.size());
        dsa.print();
        System.out.println(dsa.lastIndexOf("a"));
        dsa.removeAll(new String[]{"a","good","asa","b"});

        dsa.print();
    }
}
