package TaskDay6;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        // int[] arr = new {1,7,5,0};

        Scanner scanner = new Scanner(System.in);
        int max1 = Integer.MIN_VALUE, max2 = 0;

        while (true) {
            int num1 = scanner.nextInt();
            if (num1 > max1) {
                max2 = max1;
                max1 = num1;
            }
            if (num1 > max2 && num1 < max1) {
                max2 = num1;
            }
            if (num1 == 0) {

                System.out.println(max2);
                break;
            }
        }
    }
}


