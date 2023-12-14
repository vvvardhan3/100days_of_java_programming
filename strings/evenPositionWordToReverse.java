package strings;

import java.util.Scanner;

public class evenPositionWordToReverse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = obj.nextLine();


        String[] words = input.split(" ");

        System.out.println("Words in the string are: ");
        for(String word : words){
            System.out.println(word);
        }


        System.out.println("Reverse of even positioned words are: ");
        for(int i = 0; i < words.length; i++){
            if (i % 2 ==0) {
                System.out.println(new StringBuilder(words[i]).reverse()+ " ");
            }
        }




        obj.close();
    }
}
