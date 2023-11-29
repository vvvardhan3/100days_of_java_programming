// Writing a java program to find the addition of two fractions

import java.util.Scanner;

public class fraction {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of x1: ");
        int x1 = obj.nextInt();
        System.out.println("Enter value of y1: ");
        int y1 = obj.nextInt();
        System.out.println("Enter value of x2: ");
        int x2 = obj.nextInt();
        System.out.println("Enter value of y2: ");
        int y2 = obj.nextInt();

        int x3 = (x1 * y2) + (x2 * y1);
        int y3 = (y1 * y2);

        System.out.println(x3/y3);


        obj.close();
    }
}
