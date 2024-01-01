package collections.collection.list;

import java.util.Vector;

public class vector {

    public static void main(String[] args) {
        vectormethod();
    }

    public static void vectormethod(){

        // Default size --> 10 . But we can also define the size of the list As we want
        /* Vector v1 = new Vector(n) --> 'n' indicates the size of the list that we want to define */

        /* 
         * We can convert a Array into List using,
         *  Vector v1 = new Vector(Arrays.asList());
         */

        // Creation and Addition of Elements into the List
        Vector v1 = new Vector();
        v1.add("Vishnu Vardhan");
        v1.add(0,"Gopi"); // Specifying that Gopi should be at index 0 (Right-Shift happened)
        v1.add(0,"Preethi"); // After Execution, based on last addition of element, the array is redefined
        

        Vector v2 = new Vector();
        v2.add("Virat");
        v2.add("Bhargav Ram");
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
        // we will retrie the elements from the list */

        // Deletion of Elements from the List
        v1.remove(1); /* Deletion based on the index value */
        v1.remove("Virat");
        v1.removeAll(v2); // We can also remove entire vector we created
        System.out.println(v1);
        // v1.clear();// to remove all the elements in the list
        // Verification of Elements in the List
        System.out.println(v1.contains("Preethi"));
        System.out.println(v1.containsAll(v2)); // Returns False, As we removed all the elements in the v2
        //Updation of element in the List
        v1.set(1, "Vankayalapati");
        // System.out.println(v1);
        
        // Other Methods:
        /*
         * Size()
         * Capacity()
         * lastIndexOf()
         * FirstElement and LasElement
         * toArray() --> sout(array.toString());  
         */

    }
    
}
