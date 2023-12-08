// Program the even numbers between given start and end number 
package loopstatements;

import java.util.Scanner;

public class nEvenNumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Start number: ");
        int start = obj.nextInt();
        System.out.println("Enter a end number: ");
        int end = obj.nextInt();
        for (int i = start; i <= end; i++) {
            if (i%2==0) {
                System.out.print(i+ " ");                
            }
        }
        obj.close();
    }
    
}
