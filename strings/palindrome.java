// Program to print palindrome!
package strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = obj.nextLine();

        String new_input = ""; 

        for (int i = input.length() - 1; i >= 0; i--) {
            new_input += input.charAt(i);
        }
        System.out.println(new_input);

        if (input.equals(new_input)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }

        obj.close();
    }
}
