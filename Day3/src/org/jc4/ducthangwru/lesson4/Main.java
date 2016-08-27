package org.jc4.ducthangwru.lesson4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("example.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("example_encrypted.txt");

        int c;
        while((c = fileInputStream.read()) != -1) {
            c += 5;
            fileOutputStream.write(c);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
