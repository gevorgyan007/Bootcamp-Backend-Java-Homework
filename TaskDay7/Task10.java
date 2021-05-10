package TaskDay7;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Enter number  ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double sum = 0;
        int count = 0;
        for (int i = num; i > 0 ; i/=10)
        {
            count++;
        }
        for (int j = 0; j <= count ; j++)
        {
            sum +=(Math.pow(2,j)*(num%10));
            num/=10;
        }
        System.out.println((long)sum);
    }
}
