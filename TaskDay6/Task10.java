package TaskDay6;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        char charVar;
        int i = 32, count = 0;

        while (i < 122) {

            charVar = (char) i;
            if (i % 10 == 0) {
                System.out.print("\n");
            }
            System.out.print(charVar + " ");
            i++;
        }
    }
}
