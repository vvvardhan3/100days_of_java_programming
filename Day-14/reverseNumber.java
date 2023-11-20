// Writing a java program to reverse the given number 

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a Integer: ");
        int n = obj.nextInt();
        String str = Integer.toString(n);
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
        obj.close();
    }
}
