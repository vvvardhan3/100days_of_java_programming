// Writing a java program to find weather the given character is vowel or consonent!
import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a Character: ");

        char N = obj.next().charAt(0);

        if (N == 'A' || N == 'E' || N == 'I' || N == 'O' || N == 'U' 
        || N == 'a' || N == 'e' || N == 'i' || N == 'o' || N == 'u') {

            System.out.println("Vowel!");
        } else if  (( N >= 'a' && N <= 'z') || ( N >= 'A' && N <= 'Z')) {
            System.out.println("Consonent!");
        } else {
            System.out.println("Invalid, Enter a Alphabet");
        }
        obj.close();
    }
    
}
