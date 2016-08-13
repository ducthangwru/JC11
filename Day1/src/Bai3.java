import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int number1;
        int number2;
        String operation;
        double result = 0;
        
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Nhập phép toán: ");
            number1 = input.nextInt();
            operation = input.next();
            number2 = input.nextInt();

            switch (operation) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "x":
                    result = number1 * number2;
                    break;
                case ":":
                    result = number1 / number2;
                    break;
                default:
                    throw new InputMismatchException();
            }
            
            System.out.println(number1 +" "+ operation + " " + number2 + " = " + result);


        } catch (InputMismatchException e) {
            System.out.println("Bạn đã nhập sai toán tử");
        }
    }
}
