package Files.handleTextFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class scanner {
     public static void main(String[] args) throws IOException {

         
        File file = new File("./sample.txt");

        if (!file.exists()) { 
           file.createNewFile();
        }
        // file.delete(); // Deleting the created file

        // Scanner Class:
       

        Scanner obj = new Scanner(file);

        // obj.next() --> reads only next token
        // obj.nextLine() --> reads entire line

        while (obj.hasNextLine()) {
            System.out.println(obj.nextLine());
            
        }
        obj.close();
    }
}
