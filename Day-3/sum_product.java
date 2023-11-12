import java.util.Scanner;

public class sum_product {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        float input_1 = ob.nextFloat();
        float input_2 = ob.nextFloat();
        float sum = input_1 + input_2;
        float product = input_1 * input_2;
        System.out.println("Sum of inputs: " + sum );
        System.out.println("Product of inputs: " + product);
        ob.close();
    }
}
