// Print the statement based on day name
package decisionMakingStatement;

import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please Enter a valid name of a day: ");
        String input = obj.next();

        if (input.equals("Monday")) {
            System.out.println("Uff, It's a Weekday");
        }else if (input.equals("Tuesday")) {
            System.out.println("Uff, It's a Weekday");
        }else if (input.equals("Wednesday")) {
            System.out.println("Uff, It's a Weekday");
        }else if (input.equals("Thursday")) {
            System.out.println("Uff, It's a Weekday");
        }else if (input.equals("Friday")) {
            System.out.println("Uff, It's a Weekday");
        }else if (input.equals("Saturday")) {
            System.out.println("Yayy, It's a Weekend");
        }else if (input.equals("Sunday")) {
            System.out.println("Yayy, It's a Weekend");
        }
        else{
            System.out.println("Invalid Day!!");
        }
        obj.close();
    }
    
}
