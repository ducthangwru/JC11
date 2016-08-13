package org.jb11.ducthangwru.lession4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1, side2, side3;

        try {
            System.out.println("Nhập 3 cạnh của tam giác!");
            side1 = input.nextDouble();
            side2 = input.nextDouble();
            side3 = input.nextDouble();

            if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
                throw new IllegalArgumentException();

            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println(triangle.toString());

        } catch (InputMismatchException e) {
            System.out.println("3 độ dài cạnh không chính xác!");
        }
    }
}
