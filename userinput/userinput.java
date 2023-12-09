package userinput;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("What's your name?");

        String name = obj.nextLine();

        System.out.printf("Hey %s, How are you doing? \n", name);

        // String state = obj.next();

        System.out.printf("What's your age? \n");

        int age = obj.nextInt();

        System.out.printf("I am %d years old! \n", age);
        
        System.out.printf("Thank you for the information, %s",name);

        obj.close();
    }
}
