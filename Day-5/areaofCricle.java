// Writing a java program to print the area of circle when its given the value of radius

import java.util.Scanner;

public class areaofCricle {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Radius = ");
        double radius = ob.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle is: " + area);
        ob.close();
    }
}
