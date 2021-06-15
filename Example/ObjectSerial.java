package com.company.Example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerial {
    public static void main(String[] args) throws IOException {
        Human human = new Human(21,"Vlad");
        try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Taron\\Desktop\\Aca_Bootcamp_Task\\src\\com\\company\\Example\\test")) {
            try (ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {
                outputStream.writeObject(human);
            }
        }

    }
}
