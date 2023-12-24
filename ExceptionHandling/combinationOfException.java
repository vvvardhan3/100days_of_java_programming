package ExceptionHandling;

import java.util.Arrays;

public class combinationOfException {
    public static void main(String[] args) throws ArithmeticException {
        method1();
    }


    public static void method1(){
        method2();
    }

    public static void method2(){
        int a = 10;
        int b = 0;
        int result = 0;

        System.out.println("Program Started!");

        try {
            result = a / b;
        } catch (ArithmeticException ae) {
            System.out.println(Arrays.toString(ae.getStackTrace()) );
            /*ae.getMessage() / .getLocalizedMessage()  --> Gives only Message */
            /* (Arrays.toString(ae.getStackTrace()) --> Gives the location of the code*/
        }finally{
            System.out.println("Program is Running..");
        } 
        
        System.out.println("Result: "+result);
        System.out.println("Program ends here!");

    }


}
