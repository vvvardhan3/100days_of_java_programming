import java.util.Scanner;

public class income {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter your annual income: ");
        int income = obj.nextInt();

        int it = 0;

        if (income < 250000) {
            it = 0;
        }
        else if (500000 > income && income > 250000) {
            it = (5 * (income - 250000))/ 100 ;   
        }
        else if (1000000 > income && income > 500000) {
            it = (20 * (income - 500000))/ 100 + 12500;
        }
        else if (1000000 < income)
            it = (30 * (income - 1000000))/ 100 + 112500;
        else{
            System.out.println("Enter a valid income!");;
        }

        int incomeaftertax = income - it;
        System.out.println("Your income after tax: " + incomeaftertax);



        obj.close();

    }
}
