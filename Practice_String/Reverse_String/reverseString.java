package Reverse_String;
// Writing a java program to reverse the given input String
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your input: ");
        String input = obj.next();

        //String str = "Hello";
        char[] array = input.toCharArray();
        // Approach-1:
        for(int i = array.length-1; i >=0; i--){
            System.out.print(array[i]);
        }
        System.out.println(" ");
        // Approach-2:
        for (int i = input.length()-1; i >=0; i--){
            System.out.print(input.charAt(i));
        }
        System.out.println(" ");
        // Approach-3:
        StringBuffer sb = new StringBuffer(input);
        System.out.println(sb.reverse());
        // Approach-4:
        StringBuilder sBuilder = new StringBuilder(input);
        System.out.println(sBuilder.reverse());
        obj.close();

    }
    
}
