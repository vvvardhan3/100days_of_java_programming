package strings;

public class heapVsStringPool {
    public static void main(String[] args) {
        // String Creation and Assigning!
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        // Comparison is done based on the addresses of string, not based on the inside string "Sequence of characters"
        
        System.out.println(s1 == s2); // True, because it has Same memory block for each string "Hello" (String Pool)
        System.out.println(s3 == s4); // False, because it has different memory block for each string "Hello" (Heap Memory)
        System.out.println(s1 == s3); // False
        
        // Now, Comparison is done based "Sequence of character" String 
        
        System.out.println(s1.equals(s2)); // True, because of the same sequence of characters
        System.out.println(s1.equals(s3)); // True, because of the same sequence of characters
        System.out.println(s3.equals(s4));

    }
    
}
