// Writing a java code to find the biggest of two numbers using ternary operator

import java.util.Scanner;

public class bigOfTwo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        
        int result = (a >b)? a:b;

        System.out.println("The biggest number among two given numbers is: " + result);

        obj.close();
    }
}
