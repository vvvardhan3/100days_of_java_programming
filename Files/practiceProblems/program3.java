// Program to find the Number of words in text file
package Files.practiceProblems;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class program3 {
    public static void wordCount() throws IOException{
        File input = new File("./sample.txt");

        FileReader fr = new FileReader(input);

        Scanner sr = new Scanner(fr);

        int count = 0;

        while (sr.hasNext()) {
            sr.next();
            count = count + 1;
        }
        System.out.println("Number of words in the text file: " + count);

        sr.close();
    }


    public static void main(String[] args) throws IOException{
        wordCount();
    }
}
