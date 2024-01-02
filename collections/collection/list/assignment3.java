// Java Program to Split a list into two lists
package collections.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class assignment3 {
     public static void Split(){
        Integer[] arrayInput = new Integer[] {4,5,0,9,8,10};
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(arrayInput));

        System.out.println("Given List is: "+ input);

        List<Integer> head = input.subList(0, 3);
        List<Integer> tail = input.subList(3, 6);  

        System.out.println(head);
        System.out.println(tail);


    }
    public static void main(String[] args) {
        Split();
    }
    
}
