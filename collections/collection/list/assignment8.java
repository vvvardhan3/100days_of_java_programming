// Java Program to create a list of common elements between two lists
package collections.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class assignment8 {
    public static void Operation(){
        Integer[] list1 = new Integer[]{4,9,8,5};
        Integer[] list2 = new Integer[]{1,8,0,5,1,6};

        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(list1));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(list2));
        ArrayList<Integer> CombinedList = new ArrayList<>();

        System.out.println("Given List1: " + arrayList1);
        System.out.println("Given List2: " + arrayList2);
        for (Integer integer : arrayList2) {
            if (arrayList1.contains(integer) && !CombinedList.contains(integer)) {
                CombinedList.add(integer);
            }
            
        }
        System.out.println(CombinedList);
        
    }
    public static void main(String[] args) {
        Operation();
    }
    
}
