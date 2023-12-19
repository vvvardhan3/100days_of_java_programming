package technicalQuestions.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class compareArrays {
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


        int[] array2 = new int[n];
        System.out.println("Enter the elements into the array: ");
        
        for(int i = 0; i < n; i++){
            array2[i] = obj.nextInt();
        }
        System.out.println("Array elements are: ");

        for(int i = 0; i < n;i++){
            System.out.print(array2[i]+ " ");
        }

        System.out.println();

        if (Arrays.equals(array1, array2)) {
            System.out.println("Arrays are equal");
        } else 
        System.out.println("Arrays are not equal");

        obj.close();
    }
}
