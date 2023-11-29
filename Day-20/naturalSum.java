// Writing a java program to find Sum of N natural numbers

import java.util.Scanner;

public class naturalSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int input = obj.nextInt();  // input :

        //int sum = (input/2) * (input + 1); // Formula for finding the sum of 'N' Natural numbers
        int sum = 0;  // sum = 0;
        for(int i = 0; i <= input;i++){  // i--> 1,2,3,4,5,6
            sum = sum + i;  // 1+2+3+4+5+6 --> 21
        }


        System.out.println("Sum of 'N' natural number: " + sum);

        obj.close();
    }
}
