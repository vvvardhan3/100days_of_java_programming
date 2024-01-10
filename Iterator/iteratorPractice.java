package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class iteratorPractice {
    public static void iterator(){
         /*
         *  It is a Interface
         *  Introduced for iterating the All collection objects.
         *  One Direction and Read Only with special Permission for removing the Elements 
         */
        Integer[] array = {1,2,3,4,5,6};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(array));

        System.out.println( "Elements in the ArrayList: "+ al);

        Iterator<Integer> i = al.iterator();

        // System.out.println("Iterating thought the ArrayList using Interator: ");
        // while (i.hasNext()) {
        //     System.out.println(i.next());
        // }

        // Removing the elements:
        i.next();
        i.remove();
        System.out.println("ArrayList after Removing Elements: "+ al);

    }
    public static void main(String[] args) {
        iterator();
    }
    
}
