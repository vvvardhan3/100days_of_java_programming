import java.util.Scanner;

public class sumofAllPrimes {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Starting Number: ");
        int Start = obj.nextInt();
        System.out.println("Enter an Ending Number: ");
        int End = obj.nextInt();
        int sum = 0;

        for (int i = Start; i <= End; i++) {
            if (isPrime(i)) {
                sum += i; 
            }
        }
        System.out.println("The sum of prime numbers between " + Start + " and " + End + " is " + sum);
        obj.close();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
