// Program to print duplicate numbers in an integer array
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class duplicateNumberInIntegerArray {

    public static void duplicateNumber(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of elements you want to keep in integer array: ");
        int number = obj.nextInt();
        var intArray = new int[number];

        System.out.println("Enter Elements into the integer elements: ");

        for(int i = 0; i< intArray.length ; i++){
            intArray[i] = obj.nextInt();
        }

        obj.close();



        System.out.print("Number Array is: ");
        System.out.println(Arrays.toString(intArray));

        // int count = 0;

        for( int i = 0; i < intArray.length; i++){
            for(int j = i+1; j < intArray.length;j++){
                if (intArray[i] == intArray[j] ) {
                    System.out.println(intArray[i]);
                    break;            
                }
            }  
        } 
    }

    public static void main(String[] args) {
        duplicateNumber();
    }
    
}
