package TaskDay6;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {


        while (true) {
            System.out.println("Enter number");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int number1 = number;
            int i = 0;
            while (number1 % 2 == 0) {
                number1 /= 2;
            }
            if (number % 2 != 0 && number1 != 1) {
                i++;
            } else {
                System.out.println(number);
                System.out.println(i);
                break;
            }

        }


    }


}

