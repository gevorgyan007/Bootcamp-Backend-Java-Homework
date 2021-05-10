package TaskDay888;

import java.util.Scanner;

public class Task15 {
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
        if (array[0] != array[1])
            System.out.println(array[0]);
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] != array[i + 1] && array[i] != array[i - 1])
                System.out.print(array[i] + ",");
        }
        if (array[array.length-1] != array[array.length-2])
            System.out.print(array[array.length-1]);
    }
}
