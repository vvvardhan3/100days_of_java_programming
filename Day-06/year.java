// Writing a java program to print weather a given year is leap or non-leap year

import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Given input Year: ");
        int year = ob.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Given year is leap!");
        }
        else{
            System.out.println("Given year is non-leap!");
        }
        ob.close();
    }
}
