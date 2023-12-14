package strings;

import java.util.Scanner;

public class reverseEachWord {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = obj.nextLine();
        // char arr[] = input.toCharArray();

        String arr[] = input.split(" ");
        String revString = "";
        
        for(int i = 0; i<arr.length;i++){
            String word = arr[i];
            String revWord = "";

            for(int j = word.length() - 1; j >= 0;j--){
                revWord = revWord +word.charAt(j);
            }
            revString = revString + revWord + " ";
        }
        System.out.println(revString);
        obj.close();
    }
    
}
