// Java program to retrieve all the key-value pairs present in HashMap
package collections.collection.maps;

import java.util.*;
import java.util.Map.Entry;

public class assignment10 {
    
    public static void HashMap(){
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(101, "Vishnu Vardhan");
        hashmap.put(102, "Bhargav");
        hashmap.put(103, "Gopi");

        Collection<Entry<Integer,String>> keyvalueCollection = hashmap.entrySet();

        for (Entry<Integer,String> value : keyvalueCollection) {
            System.out.println(value.getKey() +" : "+ value.getValue());
            
        }
    }
    public static void main(String[] args) {
        HashMap();
    }
    
}
