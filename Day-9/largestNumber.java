import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        double a = obj.nextDouble();
        
        double b = obj.nextDouble();

        if (a > b) {
            System.out.println("The greater number is: " + a);
            
        } else{
            System.out.println("The greater number is: " + b);
        }
        obj.close();
    }
    
}
