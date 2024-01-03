package collections.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class assignment12 {
    public static void PositionElement(){
        System.out.println("Given List1 is: ");
        Integer[] list1Array = new Integer[]{1,8,0,5,1,6};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(list1Array));
        System.out.println(list1);

        System.out.println(list1.size());

        System.out.println("Index of 'O' in the List is: " + list1.indexOf(0));

        System.out.println(list1.get(2));

    }
    public static void main(String[] args) {
        PositionElement();
    }
}
