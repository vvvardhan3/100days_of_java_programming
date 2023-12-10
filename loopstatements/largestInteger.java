package loopstatements;

import java.util.Scanner;

public class largestInteger {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a length of a string that you want: ");
        int input_length = obj.nextInt();
        
        System.out.println("Enter Elements: ");
        int [] input = new int[input_length];
        System.out.println(input);
        
        
        obj.close();
    }
    
}
