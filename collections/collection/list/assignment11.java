package collections.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class assignment11 {
    public static void DeleteList(){
        System.out.println("Given List1 is: ");
        Integer[] list1Array = new Integer[]{4,9,8};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(list1Array));
        System.out.println(list1);

        System.out.println("Given List2 is: ");
        Integer[] list2Array = new Integer[]{4,1,9,4,8,0,5,1,8,6};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(list2Array));
        System.out.println(list2);

        for (Integer integer : list1) {
            list2.remove(integer);
        }

        System.out.println(list2);
    }
    public static void main(String[] args) {
        DeleteList();
    }
}
