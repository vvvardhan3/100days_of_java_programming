package technicalQuestions.Arrays;

import java.util.Scanner;

public class sortArrayElements {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int n = obj.nextInt();
        int[] array1 = new int[n];
        System.out.println("Enter the elements into the array: ");
        
        for(int i = 0; i < n; i++){
            array1[i] = obj.nextInt();
        }
        System.out.println("Array elements are: ");

        for(int i = 0; i < n;i++){
            System.out.print(array1[i]+ " ");
        }

        System.out.println();
    }
    
}
