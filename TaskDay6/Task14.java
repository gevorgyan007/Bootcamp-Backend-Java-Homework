package TaskDay6;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter input 1 number");
        int number1 = scanner.nextInt();
        System.out.println("enter input 2  number great then 1");
        int number2 = scanner.nextInt();
        System.out.println("enter input 2  number great then 1");
        int number3 = scanner.nextInt();


        int i = 0;
        while (number1 <= number3) {
            number1 = number1 + ((number1 * number2)/100);
            i++;
        }

        System.out.println(i);
    }
}
