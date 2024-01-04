// Java Program to add Key-Value pairs to HashMap
package collections.maps;

import java.util.HashMap;

public class assignment2 {
    public static void HashMap(){
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(101, "Vishnu Vardhan");
        hashmap.put(102, "Preethi");
        System.out.println(hashmap);
        HashMap<Integer,String> anothermap = new HashMap<>();
        anothermap.putAll(hashmap);
        System.out.println(anothermap);
    }
    public static void main(String[] args) {
        HashMap();
    }
    
}
