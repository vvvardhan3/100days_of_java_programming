package Files.handleTextFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import loopstatements.forloop;

public class fileOutputStream {
    public static void main(String[] args) throws IOException {
        File input = new File("./sample.txt");

        if (input.exists()) 
        {
            input.delete();
        } 
        input.createNewFile();
        System.out.println(input.createNewFile());
        

        FileOutputStream fos = new FileOutputStream(input);

        fos.write(84);
        fos.write(124);
        fos.write(111);
        fos.write(111);
        fos.write(111);
        fos.write(114);
        fos.write(105);


        String newInput = ", It's Okay!";

        for( char ch: newInput.toCharArray()){
           fos.write((int)ch); 
            
        }

        fos.close();


    }
}
