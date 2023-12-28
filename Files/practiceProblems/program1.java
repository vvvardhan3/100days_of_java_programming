// Java Program to find the number of lines present in a text files
package Files.practiceProblems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class program1 {

    public static void lineCount() throws IOException{
        File input = new File("./sample.txt");
        BufferedReader reader = new BufferedReader(new FileReader(input));
        int lines = 0;
        while (reader.readLine() != null) {
            lines = lines + 1;
        } 
        System.out.println("No of Lines in the text file is: "+lines);
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        lineCount();
    }


}
