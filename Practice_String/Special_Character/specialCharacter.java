package Special_Character;
import java.util.Scanner;

public class specialCharacter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String with special characters: ");
        String input = obj.next();
        //String str = "!@#$@$@$@java";
        String plain_str = input.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Plain String is: "+ plain_str);
        obj.close();
    }

}
