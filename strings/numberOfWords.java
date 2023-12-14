package strings;

import java.util.Scanner;

public class numberOfWords {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = obj.nextLine();

        System.out.println(input.split(" ").length);

        obj.close();
    }
    
}
