package TaskDay6;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {

        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 0;
        while (i < number) {
            if (i % 3 != 0)
                System.out.println(i);
            i++;
        }
    }
}
