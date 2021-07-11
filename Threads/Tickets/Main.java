package com.company.Threads.Tickets;

public class Main {
    public static void main(String[] args) {
        Ticket[] tickets = {new Ticket(10),new Ticket(20),new Ticket(30),new Ticket(40)};

        Cashier cashier0 = new Cashier(1,tickets);
        Cashier cashier1 = new Cashier(2,tickets);
        Cashier cashier2= new Cashier(3,tickets);
        Cashier cashier3 = new Cashier(4,tickets);

        cashier0.start();
        cashier1.start();
        cashier2.start();
        cashier3.start();

    }
}
