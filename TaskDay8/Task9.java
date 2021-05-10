package TaskDay8;

import java.util.Scanner;

public class Task9 {
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
        int count = 0;
        for (int i = 1; i < array.length-2; i++)
        {
            for (int j = 0; j < array.length-2; j++) {
                if (array[i]==array[i+1])
                {
                    continue;
                }
                count++;
            }

        }
        System.out.println(count);
    }
}
