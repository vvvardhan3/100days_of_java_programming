// Writing a java program to add two integers using plus operator
import java.util.Scanner;

public class plusoperator {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int integer1 = ob.nextInt();
        int integer2 = ob.nextInt();
        int sum = integer1 + integer2;
        System.out.println("Sum of "+ integer1 + " and " + integer2 + " is: " + sum);
        ob.close();        
    }
}
