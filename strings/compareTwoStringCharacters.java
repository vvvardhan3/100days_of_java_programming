// Program to print common characters in two strings


package strings;

import java.util.Scanner;

public class compareTwoStringCharacters {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter String1:");
        String input1 = obj.nextLine().toLowerCase();

        System.out.println("Enter String2:");
        String input2 = obj.nextLine().toLowerCase();

        char[] input1Array = input1.toCharArray();
        char[] input2Array = input2.toCharArray();

        // Boolean array to keep track of printed characters
        boolean[] printed = new boolean[256]; 

        for (int i = 0; i < input1Array.length; i++) {
            for (int j = 0; j < input2Array.length; j++) {
                // Check if the character is in both strings and not printed before
                if (input1Array[i] == input2Array[j] && !printed[input1Array[i]]) {
                    System.out.print(input1Array[i] + "+");
                    printed[input1Array[i]] = true; // Mark as printed
                    break;
                }
            }
        }

        obj.close();
    }
}
