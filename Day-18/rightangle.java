// Writing a java program to print a simple right angled triangle of asterisks

import java.util.Scanner;

public class rightangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the no.of rows: ");
        int n = obj.nextInt();

        for(int i = 1;i <=n; i++)
        {
            for(int j= 1;j <=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        obj.close();
    }
    
}
