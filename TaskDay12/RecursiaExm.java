package com.company.TaskDay12;

public class RecursiaExm {
   public static int NumCount(int n) {
       if (n == 1) {
           System.out.println(1);
           return 1;}
           System.out.println(n);
           return NumCount(n - 1);


   }
   //public static void NumRev(int n) {


   //    if (n < 10) {
   //        NumRev(n+1);
   //    }
   //    System.out.print(n + " ");
   //}

    public static void main(String[] args) {
       NumCount(10);
        System.out.println();
      //  NumRev(0);
    }
}
