import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Integer: ");
        int n = obj.nextInt();
        
        String str = Integer.toString(n);

        System.out.println(str.length());
        
        obj.close();  
    }
}
