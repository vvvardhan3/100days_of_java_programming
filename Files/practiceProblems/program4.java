// Program to find the total number of occurance of particular word token in the text file
package Files.practiceProblems;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class program4 {
    public static void occurrence() throws IOException{
        File input = new File("./sample.txt");
        FileReader fr = new FileReader(input);
        Scanner sc = new Scanner(fr);
        
        String word = "the";
        int totalCount = 0;
        int wordCount = 0;

        while (sc.hasNext()) {
            totalCount++;
            if (sc.next().equals(word)) {
                
                wordCount++;
            }
        }
        System.out.println(wordCount);
        
        sc.close();
    }
    public static void main(String[] args) throws IOException {
        occurrence();
    }
}
