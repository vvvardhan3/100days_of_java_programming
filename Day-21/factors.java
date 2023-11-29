// Writing a java program to find the factors of the number

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = obj.nextInt();


        System.out.println("The factors of " +n+ " are: ");
        for(int i=1; i<=n;i++){
            if(n%i == 0){
                System.out.print(i);
                System.out.print(" ");
            } 
        }

        obj.close();
    }
}
