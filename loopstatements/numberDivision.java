// Print the numbers that are divisible by 7
package loopstatements;

import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a start number");
        int start = obj.nextInt();
        System.out.println("Enter a start number");
        int end = obj.nextInt();
        for (int i = start; i <= end; i++){
            if (i % 5 ==0) {
                System.out.print(i+" ");                  
            }

        }
        obj.close();
    }
    
}
