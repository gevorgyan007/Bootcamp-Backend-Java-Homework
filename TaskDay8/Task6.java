package TaskDay8;

import java.util.Scanner;

public class Task6 {
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
            System.out.print("Array is ::: " + array[i] + " ");
        }
        System.out.println();
        System.out.println("_________________________");
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Largest element ::" + max);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.println("Index large element::" + i);
                break;
            }
            // 1 2 3 2 1
        }
    }
}
