// Writing a java program to find the sum of digits of a given number

import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = obj.nextInt(); // Input
        int sum = 0;  // Sum = 0

        while(input != 0){
            sum = sum + input % 10; // Remainder
            input = input / 10; // Divide the number by 10
        }
        System.out.println("Sum is: " + sum);

        obj.close();
    }
}
