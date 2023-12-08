// Program to reverse a string
package loopstatements;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = obj.next();

        


        StringBuffer sB = new StringBuffer(input);
        System.out.println(sB.reverse());
        obj.close();
    }
    
}
