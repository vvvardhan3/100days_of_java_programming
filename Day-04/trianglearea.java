// writing a java program to print the area of a triangle

import java.util.Scanner;

public class trianglearea {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        float base = ob.nextFloat();
        System.out.println("input of base: " + base);
        float height = ob.nextFloat();
        System.out.println("input of height: " + height);
        double area = (1.0f/2.0f) *( base * height);
        System.out.println("Area of Triangle is: " + area);
        ob.close();

    }
}
