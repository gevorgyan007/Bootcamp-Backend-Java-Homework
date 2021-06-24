package com.company.Example;

import java.io.File;

public class IOExample {
    public static void main(String[] args) {
        String path = "D:\\test.txt";
        File file = new File(path);
       // File[] files = file.listFiles();
       // for (int i = 0; i < files.length; i++) {
       //     System.out.println(files[i]);
       // }
       // try (FileOutputStream fileOutputStream = new FileOutputStream(file);
       //      FileInputStream fileInputStream = new FileInputStream(file);
       //      Reader reader = new FileReader(file)) {
       //     fileOutputStream.write(new byte[]{1,55,66,77,88,99});
       //     byte[] bytes = fileInputStream.readAllBytes();
       //     for (int i = 0; i < bytes.length; i++) {
       //         System.out.print((char)i+" ");
       //     }
       // } catch (IOException e) {
       //     e.printStackTrace();
       // }
        Human human = new Human();
        System.out.println(human instanceof  Object);
         String s1 ="";
         //s1.intern()
    }
}
