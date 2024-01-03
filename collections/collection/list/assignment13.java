// Program to Reverse a List
package collections.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class assignment13 {
    public static void ReverseList(){
        System.out.println("Given List is: ");
        Integer[] listArray = new Integer[]{1,8,0,5,1,6};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(listArray));
        System.out.println(list);
        ArrayList<Integer> Reverselist = new ArrayList<>();

        for (int i = list.size() - 1; i > 0; i--) {
            Reverselist.add(list.get(i));
        }
        System.out.println(Reverselist);
    
    }
    public static void main(String[] args) {
        ReverseList();
    }
    
}
