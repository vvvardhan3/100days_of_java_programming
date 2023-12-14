package strings;

import java.util.Scanner;

public class numberOfCharacters {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = obj.nextLine();
        
        //Number of characters in a string:

        System.out.println(input.length());

        obj.close();
    }
    
}
