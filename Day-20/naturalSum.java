// Writing a java program to find Sum of N natural numbers

import java.util.Scanner;

public class naturalSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int input = obj.nextInt();

        //int sum = (input/2) * (input + 1);
        int sum = 0;
        for(int i = 0; i <= input;i++){
            sum = sum + i;
        }


        System.out.println("Sum of 'N' natural number: " + sum);

        obj.close();
    }
}
