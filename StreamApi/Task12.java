package com.company.StreamApi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task12 {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        //(long id, String names, String category, double price)
        products.add(new Product(1,"bookName1","Books",1000));
        products.add(new Product(2,"BabyName2","Toys",1200));
        products.add(new Product(3,"bookName3","Books",900));
        products.add(new Product(4,"Babyame4","Toys",700));
        products.add(new Product(5,"BabyName5","Toys",5000));
        products.add(new Product(6,"bookName6","Books",2500));
        products.add(new Product(6,"bookName6","Books",2500));
        products.add(new Product(6,"BabyName6","Toys",2500));

        List<Order> orderList = new ArrayList<>();
        //(long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Customer customer)
        orderList.add(new Order(1,"", LocalDate.of(2021,06,01),LocalDate.of(2021,06,30),products,new Customer(1,"Valod",4) ));
        orderList.add(new Order(2,"",LocalDate.of(2021,06,05),LocalDate.of(2021,06,25),products,new Customer(2,"Vahan",5) ));
        orderList.add(new Order(3,"",LocalDate.of(2021,05,05),LocalDate.of(2021,07,05),products,new Customer(3,"Karen",3) ));
        orderList.add(new Order(4,"",LocalDate.of(2021,05,07),LocalDate.of(2021,06,29),products,new Customer(4,"Vaxarsh",5) ));
        orderList.add(new Order(5,"",LocalDate.of(2021,06,03),LocalDate.of(2021,07,8),products,new Customer(5,"Chaguch",1) ));
        orderList.add(new Order(6,"",LocalDate.of(2021,06,04),LocalDate.of(2021,07,04),products,new Customer(6,"Mukuch",2) ));
        orderList.add(new Order(7,"",LocalDate.of(2021,06,15),LocalDate.of(2021,07,25),products,new Customer(7,"Poxos",4) ));

        List<Product> products1 = products.stream().filter(e -> e.getCategory().compareTo("Toys") == 0).peek(toys -> toys.setPrice(toys.getPrice() - toys.getPrice() * 0.1)).toList();
        System.out.println(products1);
    }
}
