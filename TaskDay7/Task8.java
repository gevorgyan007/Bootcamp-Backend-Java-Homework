package TaskDay7;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        System.out.println("Enter number 1 ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= num ; i++)
        {
            if (num % i == 0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
