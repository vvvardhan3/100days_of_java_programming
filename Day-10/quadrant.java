import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int number1 = obj.nextInt();
        int number2 = obj.nextInt();

        if (number1 > 0 && number2 >0) {
            System.out.println("The Coordinates are in 1st quadrant!"); 
        } else if (number1 < 0 && number2 > 0) {
            System.out.println("The Coordinates are in 2nd quadrant!"); 
        } else if (number1 < 0 && number2 < 0) {
            System.out.println("The Coordinates are in 3rd quadrant!"); 
        } else {
            System.out.println("The Coordinates are in 4th quadrant!"); 
        }
        obj.close();
    }
    
}
