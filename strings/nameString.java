package strings;

import java.util.Scanner;

public class nameString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        String firstName = obj.nextLine();

        System.out.println("Enter your Last Name: ");
        String lastName = obj.nextLine();

        System.out.println(lastName + "," + firstName.charAt(0));



        obj.close();
    }
    
}
