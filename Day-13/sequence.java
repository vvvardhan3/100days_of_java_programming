import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number(Start): ");
        int start = obj.nextInt();
        System.out.println("Enter a number(End): ");
        int end = obj.nextInt();
        int n = start;
        while (n<=end) {
            System.out.println(n);
            n=n+1;
        }

        obj.close();
    }
}
