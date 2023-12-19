// First non-repeating Element inside a array
package technicalQuestions.Arrays;

import java.util.Scanner;


public class firstnonRepeatingElement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int n = obj.nextInt();
        String[] array = new String[n];
        System.out.println("Enter the elements into the array: ");
        
        for(int i = 0; i < n; i++){
            array[i] = obj.next();
        }
        System.out.println("Array elements are: ");

        for(int i = 0; i < n;i++){
            System.out.print(array[i]+ " ");
        }

        System.out.println();

        for(int i = 0; i<array.length;i++){
            int count = 0;
            for( int j = 0; j< array.length;j++){
                if (array[j].equals(array[i])&& j != i) {
                    count++;
                    break;
                }
            } 
            
            if (count == 0) {
                System.out.println(array[i]);
                break;
                
            }
        }
        
        obj.close();
    }    
    
    
}
