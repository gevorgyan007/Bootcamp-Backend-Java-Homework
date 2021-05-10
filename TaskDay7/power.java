package TaskDay7;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        System.out.println("Enter number 1 ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = 1;
        for (int i = 0; i < num; i++) {
            num1*=2;
        }
        System.out.println(num1);
    }
}
