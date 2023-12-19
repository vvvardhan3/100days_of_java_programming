// Program to find the max-length word in a string

package strings;

import java.util.Scanner;

public class maxwordofString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = obj.nextLine();

        String[] partsodStrings = input.split(" ");

        String maxLenWord = " ";

        for(int i = 0; i< partsodStrings.length; i++){

            if (partsodStrings[i].length() > maxLenWord.length() ) {
                maxLenWord = partsodStrings[i];
                //System.out.println(partsodStrings[i]);
            }
        }
        System.out.println(maxLenWord);
    
        obj.close();
    }
}
