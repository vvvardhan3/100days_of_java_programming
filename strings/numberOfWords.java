package strings;

import java.util.Scanner;

public class numberOfWords {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = obj.nextLine();
        
        String[] words = input.split(" ");

        for(String word : words){
            System.out.println(word);
        }

        for(int i = 0; i < words.length; i++){
            
        }


        System.out.println(words.length);

        obj.close();
    }
    
}
