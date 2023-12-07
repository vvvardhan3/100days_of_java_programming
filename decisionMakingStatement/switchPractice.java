// Switch Statement
package decisionMakingStatement;

import java.util.Scanner;

public class switchPractice {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a valid number from 1 to 3: ");
        int input = obj.nextInt();

        switch (input) {
            case 1:
                System.out.println("First Statement");
                break;
            case 2: 
                System.out.println("Second Statement");
                break;
            case 3:
                System.out.println("Third Statement");
                break;
            default:
                System.out.println("Invalid Statement");
                break;
        }
        
        
        obj.close();
    }    
}
