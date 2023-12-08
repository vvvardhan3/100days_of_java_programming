// Print the odd numbers in reverse order
package loopstatements;

//  Print the reverse order of the odd number 
import java.util.Scanner;

public class assignment6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the end number: ");
        int end = obj.nextInt();
        // int num = 0;

        for(int i= end; i > 0 ; i--){
            if (i % 2 !=0) {
                int descend = i;
                System.out.print(descend+" ");
            }
        }
        obj.close();
    }
    
}


