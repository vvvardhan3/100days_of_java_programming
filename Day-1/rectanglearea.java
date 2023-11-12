import java.util.Scanner;

public class rectanglearea {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        double length = ob.nextDouble();
        double breadth = ob.nextDouble();
        System.out.println("Area of Rectangle: " + length * breadth);
        ob.close();
        
    }
}
