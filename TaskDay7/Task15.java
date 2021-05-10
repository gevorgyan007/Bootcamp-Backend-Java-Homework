package TaskDay7;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        System.out.println("Enter  number  ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= num; j++)
            {
                System.out.print(i*j + " ");
            }
            System.out.print("\n");
        }
    }
}
