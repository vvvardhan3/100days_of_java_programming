// Java Program to Create a list of prime numbers until 50
package collections.collection.list;

import java.util.ArrayList;

public class assignment9 {

    public static Boolean isPrime(int n){
        if(n <= 1) {
            return false;
        }
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> outputPrimeList = new ArrayList<>();
        for (int i = 2; i < 50; i++) {
            if (isPrime(i)) {
                outputPrimeList.add(i);
            }
        }
        System.out.println(outputPrimeList);
    }

   
}
