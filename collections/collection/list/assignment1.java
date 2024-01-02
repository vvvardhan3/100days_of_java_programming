// Java Program to Print the sum & avaerage of the elements present in the List - [4,5,0,9,8,10]
package collections.collection.list;

import java.util.ArrayList;
import java.util.Arrays;


public class assignment1 {
    public static void Operations(){
        Integer[] arrayInput = new Integer[] {4,5,0,9,8,10};
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(arrayInput));
        int sum = 0;
       
        for (Integer i : input) {
            sum = sum + i;
        }
        double Average = (double)sum / input.size();

        System.out.println("Sum of the elements: "+ sum);
        System.out.println("Average of the elements: "+ Average);
    }
    public static void main(String[] args) {
        Operations();
    }
    
}
