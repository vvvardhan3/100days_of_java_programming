// Writing a java program to print the product of two random numbers.
import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        float a = ob.nextFloat();
        float b = ob.nextFloat();
        float product = a * b;
        System.out.println("Product of two numbers:" + product);
        ob.close();
    }
}
