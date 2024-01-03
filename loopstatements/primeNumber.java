// Print the prime numbers between 50 to 150
package loopstatements;

public class primeNumber {
    public static void main(String[] args) {
        int num = 50;
        for(int i = num; i <= 150; i++){
            if (num % i != 0) {
                System.out.print(i + " ");
                i++;
                
            }
        }
    }
    
}
