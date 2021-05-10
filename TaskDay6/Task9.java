package TaskDay6;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int twoEx = 1;
        int count = 1;
        while (count < number)
        {
            if ((twoEx *=2 )> number) {
                System.out.println(count);
                break;
            }
                count++;
        }
    }
}
