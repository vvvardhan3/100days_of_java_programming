import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter a integer: " );
        int N = obj.nextInt();

        if (N % 2 == 0) {
            System.out.println("The integer is Even!");
        } else {
            System.out.println("This integer is Odd!");
        }

        obj.close();
    }
}
