package loopstatements;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int input = obj.nextInt();
        String str = Integer.toString(input);
        int sum = 0;

        for(int i = 1;i<=str.length(); i++){
            System.out.print(i+ " ");
            sum = sum + i;
        }
        System.out.println(" ");
        System.out.println("Sum of the given digits: "+sum);
        obj.close();
    }

}
