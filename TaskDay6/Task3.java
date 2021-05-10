package TaskDay6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter input number");
        int number = scanner.nextInt();
        int square = 1;
        for (int i = 0; i < number ; i++) {
            if (i*i < number)
                System.out.println(i*i);
        }
    }
}
