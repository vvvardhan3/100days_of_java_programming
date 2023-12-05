// Java Program using static fields!
package bankConcept;

public class program {
    static int currentBalance = 1000;

    public static void greetCustomer(){
        System.out.println("Hello, Welcome!");
    }

    public static void deposit(int amount){
        currentBalance = currentBalance + amount;
        System.out.println("Amount is deposited Sucessfully!");
    }

    public static void withdrawal(int amount){
        currentBalance = currentBalance - amount;
        System.out.println("Amount is withdrawed Sucessfully!");
    }

    public static int getCurrentBalance(){
        return currentBalance;
    }

    public static void main(String[] args) {
        greetCustomer();
        System.out.println(getCurrentBalance());
        deposit(500);
        System.out.println(getCurrentBalance());
        withdrawal(300);
        System.out.println(getCurrentBalance());
    }
    
}
