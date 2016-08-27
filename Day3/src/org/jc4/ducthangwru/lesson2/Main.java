package org.jc4.ducthangwru.lesson2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        FileSplitter fileSplitter = new FileSplitter();

        String path;
        int numberOfFile;

        System.out.println("Nhập đường dẫn link cần chia: ");
        path = input.nextLine();

        System.out.println("Nhập số lượng file cần chia: ");
        numberOfFile = input.nextInt();

        if(fileSplitter.splitter(path, numberOfFile))
            System.out.println("Chia thành công!");
    }
}
