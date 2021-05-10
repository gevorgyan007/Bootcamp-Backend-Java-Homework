package TaskDay6;

import java.util.Scanner;

public class ClassEx {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Press 1 for perimeter,  press 2 for area, press 3 to exit!");
            Scanner scanner = new Scanner(System.in);

            String number = scanner.next();
            int radius = 4;


                if ( number.equals("1")) {

                    System.out.println(2 * Math.PI * radius);
                    continue;
                }else if (number.equals("2")) {

                    System.out.println(Math.PI * Math.pow(radius, 2));
                    continue;
                }else if (number.equals("3")) {
                    System.out.println("exit");
                    break ;
                } else {
                    System.out.println("Underfinde value");
                    break;
                }


        }
    }
}
