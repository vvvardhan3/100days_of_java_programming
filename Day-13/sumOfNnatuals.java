import java.util.Scanner;

public class sumOfNnatuals {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        int n = 1;
        int result = 0;
        System.out.println("Enter the number: ");
        int limit = obj.nextInt();
        
        while (n <= limit) {
            result = result + n;
            n = n+1;

        }
        System.out.println("The sum of N natural number is: "+ result);


        obj.close();
    }
}
    
