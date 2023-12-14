// Program to remove all starting and ending spaces from the string
package strings;

import java.util.Scanner;

public class removeSpaces {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = obj.nextLine();
        
        System.out.println(input.trim());



        obj.close();
    }    
}
