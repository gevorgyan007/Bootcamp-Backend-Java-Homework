package TaskDay6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter input number");
        int number = scanner.nextInt();
        int twoEx = 2;
        for (int i = 1; i < number ; i++) {
            if (twoEx < number) {

                System.out.println(twoEx);
                twoEx *= 2;
            }
        }
    }
}
