// Printing words at even position in a given string
package strings;

import java.util.Scanner;


public class wordsAtEvenPosition {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = obj.nextLine();

        
        String[] partsofString = input.split(" ");


        for(int i = 1; i< partsofString.length; i = i + 2){
            System.out.println(partsofString[i]);
        }
        
       // String[] input_String = input.split(" ");

        //System.out.println(input);
        
        
        
        obj.close();
    }
}
