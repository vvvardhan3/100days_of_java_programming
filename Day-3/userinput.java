// Writing a java program to print the user input number
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        float input = ob.nextFloat();
        System.out.println("User Input is: " + input);
        ob.close();
    }
    
}
