package Interface.Area;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the base: ");
        var base = obj.nextDouble();
        System.out.println("Enter the Heigth: ");
        var heigth = obj.nextDouble();
        System.out.println("Enter the Radius: ");
        var radius = obj.nextDouble();

        
        rectangle rectangle = new rectangle(base,heigth);
        System.out.println("Area of the Rectangle: " + rectangle.Area());

        cricle cricle = new cricle(radius);
        System.out.println("Area of the Cricle: " + cricle.Area());

        triangle triangle = new triangle(base,heigth);
        System.out.println("Area of the Triangle: " + triangle.Area());
        obj.close();
    }
}
