// Writing a java program to find the maximum element in an array.
import java.util.Scanner;

public class maximumElement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the array length you want to take: ");

        int len = obj.nextInt();

        System.out.println("Enter the elements into array: ");

        int array[] = new int[len];

        for(int i = 0;i< len; i++){
            array[i] = obj.nextInt();
        }

        int max = 0;

        for(int i = 0; i<len;i++){
            if(array[i]>max){
                max = array[i];
            }

        }
        System.out.println("The Maximum number in the array is: " + max);
        
        obj.close();
    }    
}

