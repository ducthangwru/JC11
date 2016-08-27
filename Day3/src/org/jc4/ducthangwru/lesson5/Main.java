package org.jc4.ducthangwru.lesson5;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("example_encrypted.txt");
        int c;

        while((c = fileInputStream.read()) != -1) {
            c -= 5;
            System.out.print((char)c);
        }

        fileInputStream.close();
    }
}
