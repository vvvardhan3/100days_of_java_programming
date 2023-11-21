// Writing a java program to reverse the given input String
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = obj.next();

        for (int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        
        obj.close();

    }
}
