package Files.handleTextFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import accessModifiers.test;

public class fileReader {
    public static void main(String[] args) throws IOException {

         
        File file = new File("./sample.txt");

        if (!file.exists()) { 
           file.createNewFile();
        }
        // file.delete(); // Deleting the created file

        // FileReader Class:
        FileReader input = new FileReader(file);
        
        // FileReader Class, Also only reads every character in given entire file  

        int asciiCode;
        String text = new String();

        while ((asciiCode = input.read()) != -1) {
            text = text + String.valueOf((char)asciiCode);
            System.out.print((char)asciiCode);
            
        }
        input.close();
        
    }
}
