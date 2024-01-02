package collections.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class assignment5 {
    public static void repetitionOperation() {
        String[] arrayInput = new String[]{"baby", "ball", "soap", "baby", "shampoo", "chalk", "soap", "makeup", "baby", "lotion"};
        List<String> input = new ArrayList<>(Arrays.asList(arrayInput));
        System.out.println("Given elements are: " + input);

        for (int i = 0; i < input.size(); i++) {
            int count = 0;
            for (int j = 0; j < input.size(); j++) {
                if (input.get(i).equals(input.get(j))) {
                    count++;
                }
            }

            // Check if this is the first occurrence of the duplicate element
            boolean isFirstOccurrence = true;
            for (int k = 0; k < i; k++) {
                if (input.get(i).equals(input.get(k))) {
                    isFirstOccurrence = false;
                    break;
                }
            }

            // Print the element and its count if it's a duplicate and this is its first occurrence
            if (count > 1 && isFirstOccurrence) {
                System.out.println("Element: " + input.get(i) + ", Repetition Count: " + count);
            }
        }
    }

    public static void main(String[] args) {
        repetitionOperation();
    }
}
