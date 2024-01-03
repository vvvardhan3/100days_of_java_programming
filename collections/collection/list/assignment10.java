// Java Program to create an array from a list and print the array in the console
package collections.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class assignment10 {

    public static void inPuts(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Define the Length of the Array: ");
        Integer Length = obj.nextInt();
               
        Integer[] numbers = new Integer[Length];

        System.out.println("Please enter number");
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = obj.nextInt();
        }
        System.out.println("Array is: "+ Arrays.toString(numbers));
        obj.close();

        ArrayList<Integer> ListOutput = new ArrayList<>(Arrays.asList(numbers));
        System.out.println("ArrayList is: "+ListOutput);
    }

    public static void main(String[] args) {
        inPuts();
    }
    
}
