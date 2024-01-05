package collections.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class hashtable {
    public static void HashTable(){
        System.out.println("Creation of a map: ");
        Map<Integer,String> m = new HashMap<>();
        System.out.println();
        System.out.println("Addition of elements into the map: ");
        m.put(101 , "Vishnu Vardhan");
        m.put(102 , "Bhargav");
        m.put(103 , "gopi");
        System.out.println(m);
        System.out.println();
        System.out.println("Retrieval of keys from the map: ");
        /* System.out.println(m.keySet()); */

        Collection<Integer> keys = m.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }

        System.out.println();

        System.out.println("Retrieval of values from the map: ");
        Collection<String> values = m.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println();

        System.out.println("Retrieval of value using key: ");

        /* System.out.println(m.get(101)); */

        for (Integer key : keys) {
            System.out.println(m.get(key));
        }

        System.out.println();
        System.out.println("Deletion of elements from the map: "); 
        m.remove(101);
        System.out.println(m);

        System.out.println();
        System.out.println("Verification of keys in the map: ");
        System.out.println(m.containsKey(101)); // returns boolean --> false
        System.out.println(m.containsKey(102)); // returns  True

        System.out.println();
        System.out.println("Verification of values in the map: ");
        System.out.println(m.containsValue("Vishnu Vardhan")); // Return False
        System.out.println(m.containsValue("gopi")); // Return true

        System.out.println();
        System.out.println("Updation of elements in the map: ");
        m.replace(102, "Virat");
        System.out.println(m);

        System.out.println();
        System.out.println("Size of the map: " + m.size());

        System.out.println();
        System.out.println("To delete entire map: ");
        m.clear();
        System.out.println(m); 

    }
    public static void main(String[] args) {
        HashTable();
    }
    
}
