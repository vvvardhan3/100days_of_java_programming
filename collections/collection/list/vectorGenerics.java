package collections.collection.list;

import java.util.Arrays;
import java.util.Vector;

public class vectorGenerics {
    public static void main(String[] args) {
        VectorGenerics();
    }

    public static void VectorGenerics(){
        Integer[] array = new Integer[] {1,2,3,4,5};

        Vector<Integer> vector = new Vector<>(Arrays.asList(array));

        System.out.println(vector);

        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }
        
    }
}
