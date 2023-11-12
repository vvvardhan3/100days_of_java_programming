// Writing a java program to print sum of two numbers.

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        float a = ob.nextFloat();
        float b = ob.nextFloat();
        float sum = a + b;
        System.out.println("Sum of two numbers is: " + sum);
        ob.close();

    }
}
