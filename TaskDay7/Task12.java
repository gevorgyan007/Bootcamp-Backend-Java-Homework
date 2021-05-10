package TaskDay7;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {


        System.out.println("Enter  number  ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++)
        {
           // int count = i;

            for (int j = 0; j <= i; j++)
            {
                System.out.print((i + 1) + " ");

            }
        }

    }
}
