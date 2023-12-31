package ExceptionHandling.practiceProblems;
import java.util.Scanner;

public class assignment2 {

    public static void method() throws OddNumberException {
        // using try block with resources
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter an Integer: ");
            int number = obj.nextInt();

            if (number % 2 != 0) {
                throw new OddNumberException("Error: " + "Number is ODD");
            } else {
                System.out.println("Number is EVEN");
            }
        } 
    }

    public static void main(String[] args) {
        // In a program we can use multiple, try-catch blocks
        try {
            method();
        } catch (OddNumberException e) {
            System.err.println(e.toString());
        }
    }
}


