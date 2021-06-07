package com.company.task22;

import java.util.ArrayList;

public class task2 {
   public static boolean compare(ArrayList obj1,ArrayList obj2){
       boolean flag = false;
      if (obj1.size() == obj2.size()){
          for (int i = 0; i < obj1.size(); i++) {
              if (!obj1.get(i).equals(obj2.get(i))){
                 return false;
              }
          }
      }else {
         return false;
      }
      return true;
   }
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        System.out.println(compare(integers1, integers));
    }
}
