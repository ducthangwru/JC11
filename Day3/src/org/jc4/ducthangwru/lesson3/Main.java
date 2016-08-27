package org.jc4.ducthangwru.lesson3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileJoiner fileJoiner = new FileJoiner();

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập danh sách tập tin ngăn cách nhau bởi dấu \";\" : ");
        String listPath = input.nextLine();

        try {
            if(fileJoiner.joiner(listPath)) {
                System.out.println("Gộp thành công!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
