// Prime number or not
package loopstatements;

import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int input = obj.nextInt();

        if (input % 2 == 0) {
            System.out.println("Given Number is Even");
        } else
        {
            System.out.println("Given Number is Prime");
        }
        
        
        
        obj.close();
    }
    
}
