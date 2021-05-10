package TaskDay6;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter  number");
        int number1 = scanner.nextInt();
        int sum = 0;
        while (number1 > 1) {
            sum += (number1 % 10);
            number1 = number1 / 10;
        }
        System.out.println(sum);
    }
}
