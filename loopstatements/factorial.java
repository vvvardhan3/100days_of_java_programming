// Program to find the fractorial of a given number
package loopstatements;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = obj.nextInt();
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        obj.close();
    }
    
}
