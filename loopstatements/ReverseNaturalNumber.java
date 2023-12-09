package loopstatements;

import java.util.Scanner;

public class ReverseNaturalNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = obj.nextInt();

        for(int i = 1; i <= input; i++){
            // i++;
            System.out.print(i+ " ");
        }





        obj.close();
    }
    
}
