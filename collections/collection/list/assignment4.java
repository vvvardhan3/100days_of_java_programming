// Java program to Merge Two List into a Single List
package collections.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class assignment4 {
    public static void MergeOperation(){
        Integer[] arrayInput1 = new Integer[] {4,5,0};
        Integer[] arrayInput2 = new Integer[] {9,8,10};
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(arrayInput1));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(arrayInput2));

        array1.addAll(array2);
        System.out.println(array1);
    }
    public static void main(String[] args) {
        MergeOperation();
    }
}
