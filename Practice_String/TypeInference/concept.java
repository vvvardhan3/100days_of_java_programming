package TypeInference;

import java.util.Scanner;



public class concept {
    // 'var' is a keyword, It is not a datatype!
    // var k = 10; 'var' keyword is not allowed to defined or initialized to value!
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        var input = obj.nextInt(); // 'var' keyword is only restricted to use in the local!!
        // 'var' keyword along with variable name should must be defined and initialized at same time! 
        // We can't initialize the value to the variable in the next step!!!


        // While defining a array --> (syntax) var arr = new int[size of the array, we want!];


        System.out.println(input);

        // At compile time, Java assigns the data type based on the given input inplace of 'var'!!

        
        
        obj.close();
    }
}
