package TaskDay8;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        System.out.println("Enter size array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Enter index");
        int k = scanner.nextInt();
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

        int[] arr = new int[size-1];

        for (int i = 0,j=k; i < arr.length ; i++)
        {
            if (i != j )
            {
                arr[i] = array[i];
            }else  if(i == j )
            {
                arr[i] = array[j+1];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
