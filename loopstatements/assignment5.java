// Print the sum of even numbers
package loopstatements;

import java.util.Scanner;

public class assignment5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a start number: ");
        int start = obj.nextInt();
        System.out.println("Enter a end number: ");
        int end = obj.nextInt();
        int num = 0;
        int sum = 0;
        System.out.println(" ");
        for(int i = start; i<= end; i++){
            if (num % 2 == 0) {
                System.out.print(i+ " ");
                i++;
            }
            sum = sum +i;
        }
        System.out.println(" ");
        System.out.println("Sum of even numbers: "+sum);
        
        obj.close();
    }
    
}
