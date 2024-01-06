package collections.collection.Set;


import java.util.TreeSet;

public class treeset {
    public static void set(){
        /* No Duplicates
         * Null value allowed
         * Follow Ascending Order
         */
        System.out.println("Creation: ");
        TreeSet<Double> tree = new TreeSet<>();
        System.out.println("Addition: ");
        tree.add(11.5);
        tree.add(400.43);
        tree.add(300.56);
        tree.add(200.89);
        
        // hashset.add(500);
        tree.add(500.32);
        System.out.println(tree);
        System.out.println("Removal: ");
        tree.remove(500.32);
        System.out.println(tree);
        System.out.println("Verifications: ");
        System.out.println(tree.contains(300.56));

        double first = tree.first();
        System.out.println( "First: "+ first);
        double last = tree.last();
        System.out.println("Highest: " + last);

        System.out.println("Descending Order: " + tree.descendingSet());
        
        System.out.println("Ceiling: " + tree.ceiling(10.12));
        

        for (Double integer : tree) {
            System.out.println(integer);
        }

        System.out.println("Removing all elements from the set: ");
        tree.clear();
        System.out.println(tree);

    }
    public static void main(String[] args) {
        set();
    }
}
