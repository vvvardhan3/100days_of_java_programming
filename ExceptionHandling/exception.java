package ExceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args) throws ArithmeticException, IOException {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a integer 'a': ");
        int a = obj.nextInt();
        System.out.println("Enter a integer 'b': ");
        int b = obj.nextInt();
        int result = 0;
        obj.close();

        System.out.println("Execution is Started");

        try{
            result = a / b;
        } catch(ArithmeticException ae){
            System.out.println(ae.toString());
        }finally{
            System.out.println("Finally block is Used");
        }

        System.out.println("Output is: "+result);
        System.out.println("Execution is done");

        

    }
}
