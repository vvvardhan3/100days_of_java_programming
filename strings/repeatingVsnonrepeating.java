package strings;

import java.util.Scanner;

public class repeatingVsnonrepeating {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = obj.nextLine();

        char[] char_input = input.toCharArray();
        boolean foundNonRepeating = false;
        boolean foundRepeating = false;

        // Finding the first non-repeating character
        for(int i = 0; i < input.length(); i++) {
            int count = 0;
            for(int j = 0; j < input.length(); j++) {
                if (char_input[j] == char_input[i] && j != i) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("First non-repeating character: " + char_input[i]);
                foundNonRepeating = true;
                break;
            }
        }

        if (!foundNonRepeating) {
            System.out.println("No non-repeating character found.");
        }

        // Finding the first repeating character
        for(int i = 0; i < input.length(); i++) {
            for(int j = i + 1; j < input.length(); j++) {
                if (char_input[j] == char_input[i]) {
                    System.out.println("First repeating character: " + char_input[i]);
                    foundRepeating = true;
                    break;
                }
            }
            if (foundRepeating) {
                break;
            }
        }

        if (!foundRepeating) {
            System.out.println("No repeating character found.");
        }

        obj.close();
    }
}
