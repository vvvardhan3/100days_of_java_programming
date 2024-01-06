// Java program to retrieve all keys present in a HashMap
package collections.maps;

import java.util.Collection;
import java.util.HashMap;

public class assignment8 {
    public static void hashmap(){
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(101, "Vishnu Vardhan");
        hashmap.put(102, "Bhargav");
        hashmap.put(103, "Gopi");

        Collection<Integer> keyset = hashmap.keySet();

        for (Integer keys : keyset) {
            System.out.println(keys);
        }

    }
    public static void main(String[] args) {
        hashmap();
    }
}
