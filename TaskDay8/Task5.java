package TaskDay8;

import java.util.Scanner;

public class Task5 {
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

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] > 0 && array[i + 1] > 0) {
                System.out.print(array[i] + " " + array[i + 1]);
            }
        }
    }
}
