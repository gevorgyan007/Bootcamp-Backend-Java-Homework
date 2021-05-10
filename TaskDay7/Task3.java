package TaskDay7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter number 1 ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter number 1 ");
        int num2 = scanner.nextInt();
        for (int i = num1; i < num2; i++) {
            for (int j = num1 + 1; j < num2; j++) {
                if (i == Math.sqrt(j))
                    System.out.println(j);
            }

        }
    }
}
