package strings;

public class stringMethods {
    public static void main(String[] args) {
        String s1 = "HellO"; // Combination of both Upper and Lower-case
        String s2 = "hello"; // only Lower-case
        String s3 = "HELLO"; // only upper-case

        // Methods
        // 1. .equal() 
        System.out.println(s1.equals(s2)); // False, Because upper case and lower case are not equal
        // 2. .equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase(s3)); // True, Because we use IgnoreCase Method
        // 3. .contains
        System.out.println(s1.contains("l")); // True, As it contains "l" character
        System.out.println(s1.contains("P")); // False, As it doesn't contain any "P" character
        // 4. .startswith() and .endswith()
        System.out.println(s1.startsWith("He")); // True
        System.out.println(s1.startsWith("hE")); // False
        System.out.println(s1.endsWith("lO")); // True
        System.out.println(s1.endsWith("lo")); // False
        System.out.println(s1.endsWith("")); // True
        System.out.println(s1.startsWith("")); // True
        // 5. .length()
        System.out.println(s1.length()); // 5
        // 6. .trim()--> Only Leading and Trailing spaces are removed
        String s5 = "Hel@lo@ Wo@rld"; // (Length - 14)
        System.out.println(s5.trim()); // Hello World (Length - 11)
        // 7. .toLowerCase() and .toUpperCase()
        System.out.println(s3.toLowerCase()); // hello
        System.out.println(s2.toUpperCase()); // HELLO
        // 8. toCharArray()
        System.out.println(s1.toCharArray()); // "HellO" --> [H,e,l,l,O]
        // 9. indexOf() and lastIndexOf()
        System.out.println(s1.indexOf("O")); // 4, Gives the index of a required character
        // If the required character is not present in the string, then the indexof() method returns '-1'
        System.out.println(s1.lastIndexOf("l")); // 3 last index value of "l"
        // 10. .substring()
        System.out.println(s5.substring(2));// Prints a new substring from index '2' till end of the string
        System.out.println(s5.substring(0, 6)); // Prints a new substring from index '0' to '6'
        // 11. .split() 
        System.out.println(s5.split("@"));
        // 12. .charAt()
        System.out.println(s1.charAt(0));
        // 13. replace()
        System.out.println(s1.replace("H", "W"));
        // 14. .valueOf() --> int to string, string to int or anyother datatype
        // 15. . replaceAl()
        System.out.println(s1.replaceAll("HellO", "Preethi"));
    
    }
    
}
