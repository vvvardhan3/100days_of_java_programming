// Verify the given integer is even or odd !
package decisionMakingStatement;

import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int input = obj.nextInt();

        if (input % 2 == 0) {
            System.out.println("It's an even integer!");
        }else{
            System.out.println("It's is an odd integer!");
        }



        obj.close();
    }
    
}
