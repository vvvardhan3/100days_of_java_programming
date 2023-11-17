// Writing a java program to find the roots of quadratic equation.
import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter value of a: ");
        double a = obj.nextDouble(); // 'a' can't be zero!!
        System.out.println("Enter value of b: ");
        double b = obj.nextDouble();
        System.out.println("Enter value of c: ");
        double c = obj.nextDouble();

        if(a == 0){
            System.out.println("In quadratic equation, value of 'a' can't be zero!!");
        } else {
            double determinant = b*b-4*a*c;

            double root1 = -b + Math.sqrt(determinant)/ (2*a);
            double root2 = -b - Math.sqrt(determinant)/ (2*a);
            double root = -b / (2 * a);



            if (determinant > 0 ) {
                System.out.println("Roots are real and different: " + root1+ ',' +root2); 
        }   else if (determinant == 0){
                System.out.println("Roots are real and equal: " + root);
        }   else {
                System.out.println("Roots are complex and different: " + root1+ ',' +root2); 
        }
        }

       

        obj.close();
    }
}
