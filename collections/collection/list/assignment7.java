// Java Program to delete the duplicates from a list
package collections.collection.list;

import java.util.ArrayList;
import java.util.Arrays;


public class assignment7 {
    public static void deleteOperation(){
        Integer[] arrayInput = new Integer[]{4,1,9,4,8,0,5,8,1,8,6};
        Integer[] deleteArray = new Integer[]{9,0,5,6};

        ArrayList<Integer> Input = new ArrayList<>(Arrays.asList(arrayInput));
        ArrayList<Integer> Delete = new ArrayList<>(Arrays.asList(deleteArray));

        System.out.println("Given Input: " + Input);
        System.out.println("Given Delete List: " + Delete);
        Input.removeAll(Delete);
        System.out.println("List after the operation: " + Input);
        
    }
    public static void main(String[] args) {
        deleteOperation();
    }
    
}
