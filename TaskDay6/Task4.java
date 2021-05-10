package TaskDay6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter input number greate then 2");
        int number = scanner.nextInt();
        int count =0;
        for (int i = 2; i < number ; i++) {
            if(number % i == 0 ) {
                count +=i;
                System.out.println(count);
                break;


            }
        }
    }
}
