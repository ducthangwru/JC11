
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Nhập một số nguyên: ");
                x = input.nextInt();
                System.out.println(x);
                break;
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Chương trình yêu cầu nhập số nguyên!");
            }
        }
    }
}
