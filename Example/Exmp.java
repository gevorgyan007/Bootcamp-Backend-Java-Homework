package com.company.Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exmp {
    public static void main(String[] args) throws FileNotFoundException {
        byte[] arr = new byte[8];
        try(InputStream inputStream = new FileInputStream("C:\\Users\\Taron\\Desktop\\Aca_Bootcamp_Task\\src\\com\\company\\Example\\test.txt");) {
            System.out.println(inputStream.available());
            inputStream.read(arr);
            System.out.println(arr);
            String str = new String(arr);
            System.out.println(str);
        }catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
