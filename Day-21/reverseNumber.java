// Writing a java program to find the reverse of a number

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = obj.nextInt();
        int r = 0;

        while(n>0){
            r = n % 10;  // Remainder
            System.out.print(r);
            n=n/10; 
        }

        obj.close();
    }
}
