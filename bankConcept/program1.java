// Java Program using both non-static and static fields!
package bankConcept;

public class program1 {
    static int currentBalance = 1000;

    public static void greetCustomer(){
        System.out.println("Hello, Welcome!");
    }

    public void deposit(int amount){
        currentBalance = currentBalance + amount;
        System.out.println("Amount is deposited Sucessfully!");
    }

    public static void withdrawal(int amount){
        currentBalance = currentBalance - amount;
        System.out.println("Amount is withdrawed Sucessfully!");
    }

    public int getCurrentBalance(){
        return currentBalance;
    }

    public static void main(String[] args) {
        program1 bank = new program1();
        greetCustomer();
        System.out.println(bank.getCurrentBalance());
        bank.deposit(500);
        System.out.println(bank.getCurrentBalance());
        withdrawal(300);
        System.out.println(bank.getCurrentBalance());
    }
    
}
