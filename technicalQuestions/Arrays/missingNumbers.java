package technicalQuestions.Arrays;

import java.util.Scanner;

public class missingNumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int n = obj.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements into the array: ");
        
        for(int i = 0; i < n; i++){
            array[i] = obj.nextInt();
        }
        System.out.println("Array elements are: ");

        for(int i = 0; i < n;i++){
            System.out.print(array[i]+ " ");
        }

        System.out.println();

        int sum = 0;
        for(int i = 0; i <= array.length-1; i++){
            sum = sum + array[i];
        }
        // System.out.println("Sum of the given sequence: "+ sum);

        int start = array[0];
        int end = array[array.length-1];
        int sumOfRange = 0;

        for(int i = start; i <= end; i++){
            sumOfRange = sumOfRange + i;
        }
        // System.out.println("Sum of the Range: "+sumOfRange);

        /*To find the missing integer in a given sequence, we do a substract The "Sum of the given sequence" from "Sum of the Range" */

        int missingNumber = sumOfRange - sum;

        System.out.println("The missing integer in sequence of array: " + missingNumber );


        obj.close();
    }
    
}
 