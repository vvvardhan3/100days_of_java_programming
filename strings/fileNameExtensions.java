// Program to 
package strings;

import java.util.Scanner;

public class fileNameExtensions {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a File Name with a extension: ");
        String input = obj.nextLine();
        int index = input.lastIndexOf(".");

        for(int i = index+1; i < input.length();i++){
            System.out.print(input.charAt(i));
        }
 
        obj.close();
    }
}
