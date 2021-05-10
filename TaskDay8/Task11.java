package TaskDay8;

import java.util.Scanner;

public class Task11 {
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
        int swap;
        for (int i = 0 ; i < array.length-2;i+=2)
        {
            swap = array[i];
            array[i] = array[i+1];
            array[i+1] = swap;

        }
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
    }
}
