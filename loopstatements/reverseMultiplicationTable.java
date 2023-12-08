// Program to print a multiplication table in reverse order.
package loopstatements;

import java.util.Scanner;

public class reverseMultiplicationTable {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = obj.nextInt();
        
        for(int i = 10; i >= 1; i--){
            System.out.println(input + " * " + i + " = " + input * i);
        }
        obj.close();
    }
}
