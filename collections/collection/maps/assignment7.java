// Java program to remove all key-value pairs from a HashMap
package collections.maps;

import java.util.HashMap;

public class assignment7 {
    public static void hashmap(){
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(101, "Vishnu Vardhan");
        hashmap.put(102, "Bhargav");
        hashmap.put(103, "Gopi");

        hashmap.clear();

        System.out.println(hashmap);

    }
    public static void main(String[] args) {
        hashmap();
    }
}
