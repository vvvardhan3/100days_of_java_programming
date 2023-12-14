package strings;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = obj.nextLine();
        char[] array = input.toCharArray();

        for(int i = array.length-1;i >= 0;i--){
            System.out.print(array[i]);
        }



        obj.close();

    }
    
}
