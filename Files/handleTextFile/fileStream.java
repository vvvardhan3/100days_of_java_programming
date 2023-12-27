package Files.handleTextFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileStream {
    public static void main(String[] args) throws IOException {

         
        File file = new File("./sample.txt");

        if (!file.exists()) { 
           file.createNewFile();
        }
        // file.delete(); // Deleting the created file

        // FileStream:
        /* This FileStream Class --> Only reads the every file by each Character */
        FileInputStream input = new FileInputStream(file);

        int asciiCode;

        while ((asciiCode = input.read()) != -1) {
            System.out.print((char)asciiCode);
            
        }

        input.close();

    }
}
