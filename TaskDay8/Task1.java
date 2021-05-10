package TaskDay8;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter number 1 ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        //Random r = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] =i+1;
        }

        for (int i = 0; i < array.length; i++)
        {
            if (i%2==0){
                System.out.print(array[i] + " ");}
        }
    }
}
