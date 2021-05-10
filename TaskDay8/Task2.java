package TaskDay8;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter number 1 ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
       // Random r = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 ==0 ){
                System.out.print(array[i] + " ");
            }

        }
    }
}
