// Java Program to retrieve a value associated with a given key from the Hashmap
package collections.maps;

import java.util.HashMap;

public class assignment4 {
    public static void HashMap(){
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(101, "Vishnu Vardhan");
        hashmap.put(102, "Preethi");
        hashmap.put(103, "Bhargav");
        System.out.println(hashmap);
        // retrieve 
        System.out.println(hashmap.get(101));
        
    }
    public static void main(String[] args) {
        HashMap();
    }
    
}
