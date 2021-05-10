package TaskDay7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int num = scanner.nextInt();
        for (int i = num; i > 0; i /= 10) {
            num = i % 10;
            System.out.print(num);
        }
    }
}
