package TaskDay7;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Enter  number  ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int c1 = 0, c2 = 0, c3 = 0;

        for (int i = 1; i < count; i++) {
            int num = scanner.nextInt();
            if (num > 0) {
                c1++;
            } else if (num < 0) {
                c2++;
            } else {
                c3++;
            }
        }
        System.out.println("Positive number count -- " + c1);
        System.out.println("Negative number count -- " + c2);
        System.out.println("Zero number count -- " + c3);
    }
}
