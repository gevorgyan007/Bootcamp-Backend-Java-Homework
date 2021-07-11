package com.company.Threads;

public class Demo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();

        myThread.start();
        myThread1.start();

    }
}
class MyThread extends  Thread{
    static  int sum =0;

    public synchronized   static void Sum(){
        for (int i = 0; i < 100000; i++) {
            sum+=1;
        }
        System.out.println(sum);
    }
    @Override
    public void run() {
        Sum();
    }
}