// Writing a java program to find the largest number and it's index value in a given array.
import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the length of an array: ");
        int arrsize = obj.nextInt();
        
        int[] arr = new int[arrsize];

        System.out.println("Enter the array values: ");

        for(int i =0; i< arrsize;i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("Input: " + Arrays.toString(arr));
        
        obj.close();

        int largestNumber = arr[0];
        int largestNumberIndex = 0;

        for(int i = 0; i< arr.length; i++){
            largestNumber = arr[i];
            largestNumberIndex = i;
        }

        System.out.println("Largest Number in a given array is: " + largestNumber);
        System.out.println("Index of largest number is: " + largestNumberIndex);
       
       }
}

