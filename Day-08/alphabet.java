// Writing a java code to identify weather a given character is Alphabet or not
import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char N = obj.next().charAt(0);
        if ((N >= 'a' && N <= 'z') || (N >= 'A' && N <= 'Z')) {
            System.out.println("This is an Alphabet!");
        }else {
            System.out.println("Invalid Character! Please Enter a character: ");
        }
        obj.close();
    }
    
}
