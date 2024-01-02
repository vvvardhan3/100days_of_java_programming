package collections.collection.list;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        linkedListMethod();
    }

    public static void linkedListMethod(){ 
        // List and Queue both implements, LinkedList. So It have both methods 
        LinkedList<String> lL = new LinkedList<>();
        /* List<Integer> lL = new LinkedList<>(); --> We can also represent like this but it only have the list methods  */
        /* Queue<Integer> lL = new LinkedList<>();
         * Collection<Integer> lL = new LinkedList<>();
         * Iterable<Integer> lL = new LinkedList<>();
         * Deque<Integer> lL = new LinkedList<>();
         */ 
        /* All these LinkedList creations are valid */

        /* We can't create a linkedlist with a size */
       

        lL.add("S1");
        
        lL.add("S2");

        lL.add("S3");

        lL.add(0, "Preethi");

        System.out.println(lL);




    }
}
