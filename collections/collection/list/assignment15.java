// Java program to find the First Non repeating element in the list
package collections.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class assignment15 {
    static Integer[] arrayInput = new Integer[]{4,1,9,8,0,5,8,1,8,6};
    static ArrayList<Integer> input = new ArrayList<>(Arrays.asList(arrayInput));
    public static void nonRepeating(){
        if (input.size() > 2) {
             for (int i = 0; i < input.size(); i++) {
            int count = 0;
            for (int j = 0; j < input.size(); j++) {
                if (input.get(i).equals(input.get(j)) && j != i) {
                    count++;
                    break;
                }
            } 
            if (count == 0) {
                System.out.println("First Non repeating element in the list is: " + input.get(i));
                break;
            }
        }
            }
    }
    public static void main(String[] args) {
        nonRepeating();
    }
    
}
