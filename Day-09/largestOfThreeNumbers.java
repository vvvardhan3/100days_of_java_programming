import java.util.Scanner;

public class largestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        double a = obj.nextDouble();
        double b = obj.nextDouble();
        double c = obj.nextDouble();

        if(a >= b) {
            if(a >= c)
                System.out.println(a + " is the largest number.");
            else
                System.out.println(b + " is the largest number.");
        } else {
            if(b >= c)
                System.out.println(b + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        }

        obj.close();
    }
    
}
