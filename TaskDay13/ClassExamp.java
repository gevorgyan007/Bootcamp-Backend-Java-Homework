package com.company.TaskDay13;

public class ClassExamp {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("hello");
        //String str = st.insert(3,"jan").toString();
        String str = st.replace(2,2,"k").toString();
        String str22 = "13hshaal";
        String replace = str22.replace('h', 'g');
        System.out.println(replace);
    }
}
