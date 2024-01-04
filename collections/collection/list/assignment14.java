// Java Program to sort a list in Ascending and Descending Order
package collections.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class assignment14 {
    static Integer[] arrayInput = new Integer[]{4,1,9,4,8,0,5,8,1,8,6};
    static ArrayList<Integer> input = new ArrayList<>(Arrays.asList(arrayInput));
    public static void ascendingOrder(){
        Collections.sort(input);
        System.out.println("Ascending Order: "+ input);
    }
    public static void descendingOrder(){
        Collections.reverse(input);
        System.out.println("Descending Order: "+ input);
    }
    public static void main(String[] args) {
        ascendingOrder();
        descendingOrder();
    }
}
