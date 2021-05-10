package TaskDay6;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter input 1 number");
        int number1 = scanner.nextInt();
        System.out.println("enter input 2  number great then 1");
        int number2 = scanner.nextInt();
        float k = number1;
        int count = 1;
        while (k <= number2) {
           ++count;
            k = k +( (k *10)/100);
            System.out.println(k);

       }

        System.out.println(count);

    }
}

