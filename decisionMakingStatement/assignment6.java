package decisionMakingStatement;

import java.util.Scanner;

public class assignment6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please Enter a day (1-7): ");
        int input = obj.nextInt();

        switch (input) {
            case 1:
                System.out.println("It's a Monday!");
                break;
            case 2:
                System.out.println("It's a Tuesday!");
                break;
            case 3:
                System.out.println("It's a Wednesday!");
                break;
            case 4:
                System.out.println("It's a Thursday!");
                break;
            case 5:
                System.out.println("It's a Friday!");
                break;
            case 6:
                System.out.println("It's a Saturday!");
                break;
            case 7:
                System.out.println("It's a sunday!");
                break;
            default:
                System.out.println("It's a Invalid day!");
                break;
        }

        
        
        obj.close();
    }
}
