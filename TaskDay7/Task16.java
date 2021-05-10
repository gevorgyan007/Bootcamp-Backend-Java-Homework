package TaskDay7;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.println("Enter  number  ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j < i+1; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("---------------");
        for (int i = 1; i <= num; i++)
        {
            for (int k = 0; k < num-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i+1; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("---------------");

        for(int i=num;i>=1;i--)
        {
            for(int j=i;j<num;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
