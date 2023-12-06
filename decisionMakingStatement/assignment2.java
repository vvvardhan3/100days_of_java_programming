package decisionMakingStatement;

import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter your percentage: ");
        double input = obj.nextDouble();
        
        if (input < 35) {
            System.out.println("Fail");
        }else if ( input == 35){
            System.out.println("Pass");
        }else if (input >= 35 && input < 70) {
            System.out.println("Pass (Third Class)");
        } else if (input >= 70 && input < 85) {
            System.out.println("Pass (Second Class)");
        } else if (100  > input &&input >= 85) {
            System.out.println("Pass (First Class)");
        } else {
            System.out.println("Invalid input");
        }
        
        obj.close();
    }
}
