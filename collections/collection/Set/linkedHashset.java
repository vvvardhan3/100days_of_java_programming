package collections.collection.Set;

import java.util.LinkedHashSet;

public class linkedHashset {
    
     public static void set(){
        /* No Duplicates
         * Null value allowed
         * Follow Insertion
         */
        System.out.println("Creation: ");
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        System.out.println("Addition: ");
        lhs.add(10);
        lhs.add(200);
        lhs.add(300);
        lhs.add(400);
        // hashset.add(500);
        lhs.add(500);
        System.out.println(lhs);
        System.out.println("Removal: ");
        lhs.remove(500);
        System.out.println(lhs);
        System.out.println("Verifications: ");
        System.out.println(lhs.contains(300));

        for (Integer integer : lhs) {
            System.out.println(integer);
        }

        System.out.println("Removing all elements from the set: ");
        lhs.clear();
        System.out.println(lhs);

    }
    public static void main(String[] args) {
        set();
    }
}
