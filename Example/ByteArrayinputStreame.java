package com.company.Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ByteArrayinputStreame {
    public static void main(String[] args) throws MalformedURLException {
        //byte[] byteArr = new byte[]{1,5,7,56,48};
        //ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArr,2,2);
        //int temp ;
        //while ((temp = byteArrayInputStream.read()) != -1){
        //    System.out.println(temp);
        //}
        // try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
        //     String s = bufferedReader.readLine();
        //     System.out.println(s);
//
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        URL url = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
