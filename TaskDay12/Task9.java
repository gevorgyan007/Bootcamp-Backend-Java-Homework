package com.company.TaskDay12;

public class Task9 {
   // Example` fahrenheitCelsius(32.0, 1);
   // Output` 32 fahrenheit is 0 celsius ;
   //T(°C) = (T(°F) - 32) × 5/9
   public static void fahrenheitCelsius(float fahrenheit){
       int celsius = (int)(fahrenheit-32)*5/9;
       System.out.println(fahrenheit + " fahrenheit is "+celsius+" celsius" );
   }
    public static void fahrenheitCelsius(double celsius){
        double fahrenheit = (9/5*celsius +32);
        System.out.println(celsius + " celsius is "+fahrenheit+" fahrenheit" );
    }
    public static void main(String[] args) {
        fahrenheitCelsius(32.0f);
        fahrenheitCelsius(90.5);
    }
}
