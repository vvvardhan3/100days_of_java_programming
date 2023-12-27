package Files.handleTextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class bufferReader {
     public static void main(String[] args) throws IOException {

         
        File file = new File("./sample.txt");

        if (!file.exists()) { 
           file.createNewFile();
        }
        // file.delete(); // Deleting the created file

        // FileReader Class:

        FileReader F_input = new FileReader(file);
        // FileReader Class, Also only reads every character in given entire file  
        // BufferedReader Class:
        BufferedReader input = new BufferedReader(F_input);
        /* BufferedReader Class, It can read the file in two ways 
        --> the both each character and line by line */
        
        // int asciiCode;
        // String text = new String();

        // while ((asciiCode = input.read()) != -1) {
        //     text = text + String.valueOf((char)asciiCode);
        //     System.out.print((char)asciiCode);
            
        // }

        // System.out.println();
        // System.out.println();

        String line = new String();
        while ((line = input.readLine()) != null) 
        {
            System.out.println(line);
        }

        input.close();
        
    }
}
