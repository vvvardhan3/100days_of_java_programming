package collections.maps;

import java.util.Collection;
import java.util.HashMap;

public class assignment9 {
    public static void HashMap(){
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(101, "Vishnu Vardhan");
        hashmap.put(102, "Bhargav");
        hashmap.put(103, "Gopi");

        Collection<String> ValueSet = hashmap.values();

        for (String value : ValueSet) {
            System.out.println(value);
        }
    }
    public static void main(String[] args) {
        HashMap();
    }
}
