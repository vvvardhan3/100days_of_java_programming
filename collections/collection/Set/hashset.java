package collections.collection.Set;

import java.util.HashSet;

public class hashset {
    public static void set(){
        /* No Duplicates
         * Null value allowed
         */
        System.out.println("Creation: ");
        HashSet<Integer> hashset = new HashSet<>();
        System.out.println("Addition: ");
        hashset.add(10);
        hashset.add(200);
        hashset.add(300);
        hashset.add(400);
        // hashset.add(500);
        hashset.add(500);
        System.out.println(hashset);
        System.out.println("Removal: ");
        hashset.remove(500);
        System.out.println(hashset);
        System.out.println("Verifications: ");
        System.out.println(hashset.contains(300));



    }
    public static void main(String[] args) {
        set();
    }
}
