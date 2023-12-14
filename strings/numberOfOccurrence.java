// Program to count the occurance of a single character in a given string
package strings;

import java.util.Scanner;

public class numberOfOccurrence {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = obj.nextLine();
        // System.out.println("Enter a target character: ");
        char character = obj.next().charAt(0);
        // char character = 'l';
        input = input.replace(" ", "");
        // char arr[]=input.toCharArray();
        int count = 0;

        for(int i =0; i<input.length();i++){
            if (input.charAt(i) == character) {
                count++;
            }
        }
        System.out.println(count);


        obj.close();
    }
    
}
