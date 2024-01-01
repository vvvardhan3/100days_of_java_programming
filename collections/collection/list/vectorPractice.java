package collections.collection.list;

import java.util.Vector;

public class vectorPractice {

    public static void main(String[] args) {
        vectormethod();
    }

    public static void vectormethod(){

        // Creation and Addition of Elements into the List
        Vector v1 = new Vector();
        v1.add("Vishnu Vardhan");
        v1.add("Bhargav Ram");
        v1.add(0,"Gopi"); // Specifying that Gopi should be at index 0 (Right-Shift happened)
        v1.add(0,"Preethi"); // After Execution, based on last addition of element, the array is redefined

        Vector v2 = new Vector();
        v2.add("Virat");
        v2.add("Rahul");

        // for(int i = 0 ; i < v2.size() ; i++){
        //     v1.add(v2.get(i));
        // } 
        /* We avoid writing this code, More Code, Waste of Performance 
        instead of this we use the following to to append the elements in v1 and v2. */

        System.out.println(v1.addAll(v2));
        /* We can also add v2 elements based on the index value
         *  v1.addAll(index,v2);
         */
        System.out.println(v1);

        // Retrieval of the elements from the List
        System.out.println(v1.get(5)); /*Only have one Retrieval method based on the index 
        we will retrie the elements from the list */

    }
    
}
