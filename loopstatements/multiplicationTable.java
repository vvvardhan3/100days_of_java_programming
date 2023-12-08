// Program to print the multiplication table of a given number
package loopstatements;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = obj.nextInt();
        
        for(int i = 1; i <= input; i++){
            System.out.println(input + " * " + i + " = " + input * i);
        }

        obj.close();
    }
    
}
