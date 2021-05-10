package TaskDay8;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter size array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Enter number array");

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            array[i] = num;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("_________________________");
        int min = Integer.MAX_VALUE;
        //5  -4  3  -2  1
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
