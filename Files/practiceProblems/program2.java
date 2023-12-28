// Program to find the longest line in a text file
package Files.practiceProblems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class program2  {
    
    public static void lengthyLine() throws IOException {
        File input = new File("./sample.txt");
        BufferedReader reader = new BufferedReader(new FileReader(input));

        String logestLine = "";
        String currentLine;

        while ((currentLine = reader.readLine()) != null) {
            if (currentLine.length() > logestLine.length()) {
                logestLine = currentLine;
            }
        }
        System.out.println("Longest line: " + logestLine);
        System.out.println("Length: "+ logestLine.length());

        reader.close();
    }

    public static void main(String[] args) throws IOException {
        lengthyLine();
    }
}
