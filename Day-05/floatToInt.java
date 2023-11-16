// Writing a program to convert a float value into a integer
import java.util.Scanner;

public class floatToInt {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Float value: ");
        float num1 = ob.nextFloat();
        // type-casting: 
        int num2 = (int) num1;
        System.out.println("The integer output: " + num2);
        ob.close();
    }
    
}
