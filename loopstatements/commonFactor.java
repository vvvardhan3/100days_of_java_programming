// Program to find the GCF and LCM of a given two numbers
package loopstatements;

import java.util.Scanner;

public class commonFactor {

        public static int findGCF(int A, int B){
        int gcf = 0;
        
        for(int i = 1; i<=A && i<=B;i++){
            if (A % i == 0 && B % i == 0) {
                // System.out.print(i + " ");
                gcf = i;
            }
        }
        return gcf;
    }
        public static int findLCM(int A,int B)
        {
            System.out.println("Least Common Multiple is: ");
        return (A*B) / findGCF(A,B);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a integer 'A': ");
        int A = obj.nextInt();
        System.out.println("Enter a integer 'B': ");
        int B = obj.nextInt();
        System.out.println(findGCF(A, B));
        System.out.println(findLCM(A, B));
        obj.close();
    }    
}
