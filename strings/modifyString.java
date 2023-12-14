package strings;

import java.util.Scanner;

public class modifyString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = obj.nextLine();
        //char[] input_arr = input.toCharArray();
        //String[] str_words = input.split(" ");

        for(int i = 1; i<input.split(" ").length; i = i+2){
            String[] str_words = input.split(" ");
            System.out.println(str_words);
        }
        System.out.println(input.split(" ").length);           
        obj.close();
    }
}
