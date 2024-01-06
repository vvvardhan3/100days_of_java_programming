// Java Program to check whether a particular key/value exist in Hashmap
package collections.maps;

import java.util.HashMap;

public class assignment5 {
    public static void hashmap(){
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(101, "Vishnu Vardhan");
        hashmap.put(102, "Bhargav");
        hashmap.put(103, "Gopi");

        System.out.println(hashmap);
        System.out.println(hashmap.containsKey(103)); // True
        System.out.println(hashmap.containsValue("Gopi")); // True

    }
    public static void main(String[] args) {
        hashmap();
    }
    
}
