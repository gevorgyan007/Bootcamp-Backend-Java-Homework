package com.company.TaskDay10;

import java.util.Scanner;

public class CheckMinuteTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter minut");
        int num = scanner.nextInt();
        int houre = 0, day = 0, min =0;
        if ( num>0 && num < 59)
        {
            System.out.println("Passed" + num + "minutes");
        }else if(num >= 60)
        {
                 if(num < 1440 ) {
                     houre = num / 60;
                     min = num % 60;
                     System.out.println(houre + " houre" +min+ " minutes");
                 }else {
                     day = num/1440;
                     houre = (num-1440)/60;
                     min = (num-1440)%60;
                     System.out.println(day +" day "+houre + " houre " +min+ " minutes ");
                 }

        }


    }
}
