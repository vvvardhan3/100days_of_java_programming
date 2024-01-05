// Java Program to add given key- value pair to HashMap if and only if it is not present in the HashMap
package collections.maps;

import java.util.HashMap;

public class assignment3 {
    public static void hashmap(){
        HashMap<String,Integer> hashmap = new HashMap<>();
        hashmap.put("Vishnu", 101);
        hashmap.put("Bandi", 102);
        System.out.println(hashmap);
        hashmap.putIfAbsent("Preethi", 103); // returns key-value
        hashmap.putIfAbsent("Vishnu", 101); // Dont not return key-value 
        System.out.println(hashmap);
    }
    public static void main(String[] args) {
        hashmap();
    }
    
}
