//Java Program to find out the number of key-value mappings present in a HashMap
package collections.maps;

import java.util.HashMap;

public class assignment6 {
    public static void hashmap(){
         HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(101, "Vishnu Vardhan");
        hashmap.put(102, "Bhargav");
        hashmap.put(103, "Gopi");

        System.out.println(hashmap.size());

    }
    public static void main(String[] args) {
        hashmap();
    }
}
