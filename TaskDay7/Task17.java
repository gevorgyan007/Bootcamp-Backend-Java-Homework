package TaskDay7;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        String str = scanner.next();
        String str1 = "qwertyuiopasdfghjklzxcvbnm";
        String str2 = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        String str3 = "0123456789";
        int sum = 0;
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = 0; j <str1.length() ; j++)
            {
                if(str.charAt(i) == str1.charAt(j)
                        && str.charAt(i) == str2.charAt(j)
                        &&  str.charAt(i) == str3.charAt(j)
                        && 6<str.length()
                        && str.length()< 16)
                {
                    System.out.println("valid");
                }else
               {
                System.out.println("Invalid");
               }
            }
        }
    }
}
