package com.company.week8Countiniu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccesFile {
    public static void main(String[] args) throws FileNotFoundException {

            long dataPosition = 0; //to be determined later
            int data = 123;

            RandomAccessFile raf = null;
            try {
                raf = new RandomAccessFile("datafile.txt", "rw");

                raf.writeLong(44); //placeholder
                raf.writeChars("blahblahblah");
               // raf.seek(5);
               dataPosition = raf.getFilePointer();
                System.out.println(dataPosition);
                raf.writeInt(data);
               raf.writeUTF("yadayadayada");
               ////Rewrite the first byte to reflect updated data position.
               raf.seek(0);
               raf.writeLong(dataPosition);
                raf.close();
               // raf.seek(32);
               // data = raf.readInt();
               // System.out.println(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //Write the file.


    }
}
