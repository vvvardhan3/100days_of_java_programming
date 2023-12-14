// Program  to converts all odd characters of a string to Upper Case.
package strings;

import java.util.Scanner;

public class oddCharacterToUpperCase {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = obj.nextLine();

        char[] input_array = input.toCharArray();

        for(int i = 1; i < input_array.length;i=i+2){
            input_array[i] = Character.toUpperCase(input_array[i]);
        }
        System.out.println(new String(input_array));
        
        
        
        obj.close();
    }
}
