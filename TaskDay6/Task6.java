package TaskDay6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number>0)
        {
            System.out.print(number + ",");
            number--;
        }
    }
}
