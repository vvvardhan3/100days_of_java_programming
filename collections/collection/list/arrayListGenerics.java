package collections.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListGenerics {
    public static void main(String[] args) {
        ArrayListGenerics();
    }

    public static void ArrayListGenerics(){
        String[] array = new String[]{"Preethi", "Vishnu", "Tomato", "bharagv"};
        ArrayList<String> aL = new ArrayList<>(Arrays.asList(array));

        System.out.println(aL);

        for (int i = 0; i < aL.size(); i++) {
            System.out.print(aL.get(i) + " ");
        }
    }
}
