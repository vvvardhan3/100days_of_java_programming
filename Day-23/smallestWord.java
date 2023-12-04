// Writing a java program to find the smallest word in a given Array in term of length

import java.util.Arrays;
import java.util.Scanner;
public class smallestWord {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the length of an array: ");
        int arrsize = obj.nextInt();
        
        String[] arr = new String[arrsize];

        System.out.println("Enter the array values: ");

        for(int i =0; i< arrsize;i++){
            arr[i] = obj.next();
        }
        System.out.println("Input: " + Arrays.toString(arr));

        String smallestword = arr[0];
        int smallestWordIndex = 0;
        
        for(int i=0;i<arr.length;i++){
            if (arr.length < smallestword.length()) {
                smallestword = arr[i];
                smallestWordIndex = i;
            }
        }
        System.out.println("Smallest Word: " + smallestword);
        System.out.println("Enter the index value: " + smallestWordIndex);
        
        obj.close();


       }
}
