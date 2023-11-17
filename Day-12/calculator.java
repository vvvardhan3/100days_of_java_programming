// Writing a java program to implement simple calculator using switch statements
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        double number1 = obj.nextDouble();
        double number2 = obj.nextDouble();
        String operator = obj.next();

        switch (operator) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            case "%":
                System.out.println(number1 % number2);
                break;
            default:
                System.out.println("Please Enter a valid operator..!");
                break;
        }

        
        obj.close();
    }
}
