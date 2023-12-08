// program to sum first n even numbers 
package loopstatements;

import java.util.Scanner;

public class sumOfEven {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int end = obj.nextInt();
        int sum = 0;
        for(int i = 0; i <= end; i++){
            if (i % 2 == 0) {
                System.out.print(i+" ");
                sum = sum + i;
            }
        }
        System.out.println(" ");
        System.out.println("Sum of even numbers is: "+ sum);
        
        obj.close();
    }
    
}
