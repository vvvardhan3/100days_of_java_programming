// Program on different Print statements in Java
package differentPrintStatements;

public class Practice {

    public static void print(){
        // In print, The cursor won't goes to the next line! So the statements are printed next to each other!
        System.out.print("Hello");
        System.out.print("Print");
    }

    public static void println(){
        // The cursor goes to the next line! So the statement is gets printed in the next line!
        System.out.println("Hello");
        System.out.println("Print");
    }

    public static void printf(){
        // Formatting Statement!
        System.out.printf("Hello %s!", "Vishnu");
        System.out.printf("Your height is %d cms",180);
    }
    public static void main(String[] args) {
        print();
        System.out.println(" ");
        println();
        printf();
    }
}
