package com.company.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {
    //Obtain a list of products belongs to category “Books” with price > 1000
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        //(long id, String names, String category, double price)
        products.add(new Product(1,"bookName1","Books",1000));
        products.add(new Product(2,"bookName2","Books",1200));
        products.add(new Product(3,"bookName3","Books",900));
        products.add(new Product(4,"bookName4","Books",700));
        products.add(new Product(5,"bookName5","Books",5000));
        products.add(new Product(6,"bookName6","Books",2500));


        List<Product> booksOfCateg = products.stream().filter(book -> book.getPrice() > 1000).collect(Collectors.toList());
             System.out.println(booksOfCateg);

    }
}
