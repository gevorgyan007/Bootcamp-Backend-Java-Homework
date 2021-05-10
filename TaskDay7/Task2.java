package TaskDay7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter number 1 ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter number 1 ");
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        for (int i = a; i < b; i++) {
            if (i % d == c)
                System.out.print(i + ",");
        }
    }
}
