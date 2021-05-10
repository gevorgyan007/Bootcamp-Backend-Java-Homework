package TaskDay8;

import java.util.Random;

public class ClassEx {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Random r =new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",.");
        }
        System.out.println();
        System.out.println("________________________________");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
