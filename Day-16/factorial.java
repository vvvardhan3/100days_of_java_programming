// Writing a java program to find the factorial of a given number
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int end = obj.nextInt();

        long factorial = 1;

        if (end < 0) {
            System.out.println("Factorial does not exists");        
        } else if (end == 0 ){
            System.out.println("Factorial of 0 is 1!");
        } else{
            for ( int i=1; i <= end; i++)
            {
                factorial = factorial * i;
            }
            System.out.println(factorial);
        }
        
        
        obj.close();
    }
}
