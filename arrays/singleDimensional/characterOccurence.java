package arrays.singleDimensional;

import java.util.Scanner;


public class characterOccurence {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter a String: ");
        String something = obj.next();
        // System.out.println("Enter a charater, that you want to find it's occurence: ");
        char occurenceCharacter = 'e';
        int count = 0;

        for(int i =0; i<something.length();i++){
            if (something.charAt(i) == occurenceCharacter) {
                count++;
            }
        }
        System.out.println(count);
        obj.close();
    }
    
    
}
