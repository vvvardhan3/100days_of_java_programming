package decisionMakingStatement;

import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int input = obj.nextInt();

        switch (input % 2) {
            case 1:
                System.out.println("It is an Odd number!");
                break;
        
            default:
                System.out.println("It is an even number!");
                break;
        }
        
        obj.close();
    }
    
}
