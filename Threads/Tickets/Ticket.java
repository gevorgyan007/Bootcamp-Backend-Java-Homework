package com.company.Threads.Tickets;

public class Ticket {
    boolean isSold;
    int place;

    public Ticket(int place) {
        this.place = place;
    }

    public synchronized void buy(Cashier cashier) {
        if (!isSold) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isSold = true;
            System.out.println("Cashier.id " + cashier.id + " Ticket " + this.place);
        }
    }

}
