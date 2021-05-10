package TaskDay7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num ; i++)
        {
            if (num % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}
