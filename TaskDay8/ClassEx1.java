package TaskDay8;

import java.util.Random;

public class ClassEx1 {
    public static void main(String[] args) {
        int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0)
                System.out.print(arr[i] + ",");
        }
    }
}
