import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int[] a;
        a = new int[10];
        int index = 0;
        Scanner input = new Scanner(System.in);

        while(true){
            try {
                System.out.println("Nhập vị trí: ");
                index = input.nextInt();
                System.out.println("Nhập giá trị: ");
                a[index] = input.nextInt();
                System.out.println(a[index]);
                break;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Lỗi! Nhập lại!");
            }
        }
    }
}
