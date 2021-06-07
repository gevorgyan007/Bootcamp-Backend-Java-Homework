package com.company.DynamicArray;

public class Main {



    public static void main(String[] args) {
        SimpleList<String> simpleList = new SimpleList();
        simpleList.add("lskahnflsh");
        simpleList.add("hay");
        simpleList.add("vay");
        simpleList.add(null);
        simpleList.add("hjdghdf");
        simpleList.remove(null);
        System.out.println(simpleList.toString());

       // SimpleList<String> simpleList2 = new SimpleList();
       // simpleList2.add("1");
       // simpleList2.add("2");
       // simpleList2.add("3");
       // simpleList2.add("4");
       // simpleList.join(simpleList2);
       // System.out.println(simpleList.toString());
//
        // simpleList.reverse();
       // for (int i = 0; i < simpleList.size(); i++) {
       //     System.out.println(simpleList.getReturn(i));
       // }
    }
}
