// Java Program to Write different ways of creating a hashmap
package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class assignment1 {
    public static void CreateHashMap(){
        // Default:
        Map<Integer,String> hashmap = new HashMap<>();
        hashmap.put(1512114925, "Vishnu Vardhan Vankayalapati");
        System.out.println( "Type1: "+ hashmap);
        // With Initial Capacity:
        /*Default Capacity is 16 buckets and 0.75f Load Factor */
        Map<Integer,String> hashmap1 = new HashMap<>(2);
        hashmap1.put(17, "Bhargav Ram");
        hashmap1.put(18, "Jaidev");
        System.out.println( "Type2: "+ hashmap1);
        // Copying another HashMap:
        Map<Integer,String> hashmap3 = new HashMap<>(hashmap1);
        hashmap3.put(19, "NagaRaju");
        System.out.println("Type3: " + hashmap3);
        // With Initial Capacity 30 and 0.5 Load Factor:
        Map<Integer,String> hashmap4 = new HashMap<>(30,0.5f);
        hashmap4.put(18, "Jaidev");
        hashmap4.put(19, "Jaidev");
        System.out.println(hashmap4); // No duplicate 'Key' value

    }
    public static void main(String[] args) {
        CreateHashMap();
    }
    
}
