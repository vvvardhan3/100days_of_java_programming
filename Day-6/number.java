import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Given input number is: ");
        float number = ob.nextFloat();
        if (number > 0) {
            System.out.println("This is a positive number");
        }
            else if (number < 0) {
                System.out.println("This is negative number");
            }
                else {
                    System.out.println("Zero");
                }
        ob.close();
    }
}

