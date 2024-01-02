// Java program to print the sum of even numbers in the list - [4,5,0,9,8,10]
package collections.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class assignment2 {
    public static void evenSum(){
        Integer[] arrayInput = new Integer[] {4,5,0,9,8,10};
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(arrayInput));
        ArrayList<Integer> output = new ArrayList<>();

        for (Integer i : input) {
            if (i % 2 == 0) {
            output.add(i);      
            }
        }
        int evenSum = 0;
        for (Integer integer : output) {
            evenSum = evenSum + integer;
        }
        System.out.println("Sum of Even numbers in the list: " + evenSum);

    }
    public static void main(String[] args) {
        evenSum();
    }
}
