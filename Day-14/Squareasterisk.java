// Writing a java program to print the square asterisks "*"
import java.util.Scanner;

public class Squareasterisk {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");        
        int n = obj.nextInt();

        for(int i = 1; i <=n; i++)
        {
            for(int j = 1; j <=n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        obj.close();

    }
}
