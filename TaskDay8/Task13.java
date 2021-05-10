package TaskDay8;

import java.util.Scanner;

public class Task13 {
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
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        int minIndex=0, maxIndex=0;
        for (int k = 0; k < array.length; k++) {
            if(array[k]==min)
            {
                minIndex = k;
            }
            if(array[k]==max)
            {
                maxIndex = k;
            }
        }
        array[minIndex] = max;
        array[maxIndex] = min;
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
