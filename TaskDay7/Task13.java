package TaskDay7;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Enter  number  ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j <= num; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
    }
}
