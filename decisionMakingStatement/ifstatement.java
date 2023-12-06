package decisionMakingStatement;

import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int input = obj.nextInt();

        if (input > 0) {
            System.out.println("Entered integer is positive!");
        } else {
            System.out.println("Entered integer is negative!");
        }
        
        obj.close();
    }
}
