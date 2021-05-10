package TaskDay8;

import java.util.Scanner;

public class Task12 {
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
        int swap = array[array.length - 1];
        for (int i = array.length-1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0 ]=swap;
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
    }
}
