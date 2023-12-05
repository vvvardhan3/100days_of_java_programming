
import java.util.*;
public class secondlargest {
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

        int largestNumber = 0;
        int secondLargestNumber = 0;
        int secondLargestNumberIndex = 0;
        
        for(int i = 0; i< arr.length; i++){

            if (largestNumber < arr[i]) {
                secondLargestNumber = largestNumber;
                largestNumber = arr[i];
                System.out.println("Largest Number is: " + largestNumber);
            } 
            else if (arr[i] > secondLargestNumber  ) {
                secondLargestNumber = arr[i];
                secondLargestNumberIndex = i;
            }
        }

        System.out.println("Second Largest Number in a given array is: " + secondLargestNumber);
        System.out.println("Second Largest Number Index in a given array is: " + secondLargestNumberIndex);
        
       
       }
}
