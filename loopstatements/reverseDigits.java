package loopstatements;

import java.util.Scanner;

public class reverseDigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int input = obj.nextInt();
        String str = Integer.toString(input);
        
        for(int i = str.length()-1;i >= 0;i--){
            System.out.print(str.charAt(i));
            
        }

        obj.close();
    }
    
}
