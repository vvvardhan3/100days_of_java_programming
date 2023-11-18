package Remove_Spaces;

import java.util.Scanner;

public class removeSpaces {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a strig with spaces: ");
        String input = obj.nextLine();

        //String str = " H E L L o ";

        String str1 = input.replaceAll("\\s", "");
        System.out.println(str1);

        obj.close();   
    }
}
