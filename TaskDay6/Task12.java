package TaskDay6;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {


        int f1 = 1;
        int f2 = 1, count = 3;
        boolean flag = true;
        while (flag) {
            System.out.println("Enter number");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number == f1 || number == f2) {
                System.out.println(1);
                break;
            }
            int fn = f1 + f2;
            while (fn < number) {
                f1 = f2;
                f2 = fn;
                fn = f1 + f2;
                count++;
            }
            if (fn == number) {
                count++;
                break;
            }

        }
        System.out.println(count);
    }
}


