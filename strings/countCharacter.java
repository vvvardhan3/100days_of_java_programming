package strings;

import java.util.Scanner;

public class countCharacter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = obj.nextLine();

        // System.out.println("Length of the String is: " + input.length());

        int UpperCasecount = 0;
        int LowerCasecount = 0;
        int DigitCount = 0;
        int SpecialCharactercount = 0;

        

        for(int i = 0; i< input.length();i++){
            if (Character.isUpperCase(input.charAt(i))) {
                //System.out.print(input.charAt(i)+ " ");

                UpperCasecount = UpperCasecount + 1;
            }
        }
        System.out.println("Number of UpperCase Letters are: " + UpperCasecount);

        

        for(int i = 0; i< input.length();i++){
            if (Character.isLowerCase(input.charAt(i))) {
                //System.out.print(input.charAt(i)+ " ");

                LowerCasecount = LowerCasecount + 1;
            }
        }
        System.out.println("Number of LowerCase Letters are: " + LowerCasecount);



        for(int i = 0; i< input.length();i++){
            if (!Character.isLowerCase(input.charAt(i)) && !Character.isLowerCase(input.charAt(i)) && !Character.isUpperCase(input.charAt(i))) {
                //System.out.print(input.charAt(i)+ " ");

                SpecialCharactercount = SpecialCharactercount + 1;
            }
        }
        System.out.println("Number of SpecialCharactercount are: " + SpecialCharactercount);

        for(int i = 0; i< input.length();i++){
            if (Character.isDigit(input.charAt(i))) {
                //System.out.print(input.charAt(i)+ " ");

                DigitCount = DigitCount + 1;
            }
        }
        System.out.println("Number of Digits are: " + DigitCount);

        //int TotalLength =  UpperCasecount + LowerCasecount + DigitCount + SpecialCharactercount;
        //System.out.println("Length of all type of charaters are: " + TotalLength);


        obj.close();
    }
    
}
