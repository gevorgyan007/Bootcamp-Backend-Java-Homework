package com.company.Threads.Wallet;

public class Wallet {
    private volatile int money;

    public Wallet(int money) {
        this.money = money;
    }

    public int getMoney() {

        return money;
    }



    public void setMoney(int money) {

        this.money = money;
    }

    public synchronized void takeMoney(int value) {
        if (money > value) {
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
            money -= value;
            System.out.println(money);
        }
    }
}
