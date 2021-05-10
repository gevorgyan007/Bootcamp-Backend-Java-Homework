package TaskDay7;

import java.util.Scanner;

public class Task98 {
    public static void main(String[] args)
    {
        System.out.println("Enter 10 number ");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i < 10 ; i++)
        {
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
