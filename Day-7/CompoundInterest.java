// Writing a java program to calculate compound interest on giving Principal, rate and time.

import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        double P = obj.nextDouble();
        
        double R = obj.nextDouble();

        double T = obj.nextDouble();

        double CI = P* Math.pow(1+R/100, T);
        System.out.println("Total Amount: " + CI);

        DecimalFormat df = new DecimalFormat("0.##");
        ;
        System.out.println(df.format(CI));
        
        obj.close();
    }
}
