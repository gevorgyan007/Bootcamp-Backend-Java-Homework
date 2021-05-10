package TaskDay6;

import java.util.Scanner;

public class FactorialEx {
    public static void main(String[] args) {


            System.out.println("Enter number");
            Scanner scanner = new Scanner(System.in);
            String number = scanner.next();

            int factorial = 1;
            if (Integer.parseInt(number) == 0) {
                factorial = 1;
            }
            for (int i = Integer.parseInt(number); i > 0; i--) {

                factorial *= i;
            }
            System.out.println(factorial);
        }

}
