package decisionMakingStatement;

import java.util.Scanner;

public class assignment5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int i = obj.nextInt();

        System.out.println("Enter second number: ");
        int j = obj.nextInt();

        System.out.println("Choose an operator from:  +,-,*,or /");
        char operator = obj.next().charAt(0);


        switch (operator) {
            case '+':
                System.out.println(i+j);    
                break;
            case '-':
                System.out.println(i-j);
                break;
            case '*':
                System.out.println(i*j);
                break;
            case '/':
                System.out.println(i/j);
                break;
            default:
                System.out.println(i%j);
                break;
        }
        
        obj.close();
    }
    
}
