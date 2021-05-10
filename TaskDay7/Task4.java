package TaskDay7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter number 1 ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Enter number 1 ");
        int d = scanner.nextInt();
        int count = 0;

        for (int num = x; 1 <= num; num = num / 10) {

            if (x % 10 == d){
                 count++;}
            x = x / 10;
            }

        System.out.println(count);
    }
}
