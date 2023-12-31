// Java program that throws an exception and catch it using try-catch block
package ExceptionHandling.practiceProblems;

import ExceptionHandling.exception;

public class assignment1 extends exception{
    public static void exception(){
        int a = 10;
        int b = 0;
        int result = 0;

        System.out.println("Execution is started!");

        try {
            result = a/b;
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Finally block is Executed !");
        }
        System.out.println("Result: " + result);
        System.out.println("Execution is done!");

    }

    public static void main(String[] args) {
        exception();
    }



}
