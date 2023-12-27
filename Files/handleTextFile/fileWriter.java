package Files.handleTextFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) throws IOException {
        File input = new File("./sample.txt");

        if (input.exists()) {
            input.delete();
        }
        input.createNewFile();
        System.out.println(input.createNewFile());

        FileWriter fw = new FileWriter(input);
        String s = "Vishnu Vardhan Vankayalapati";

        fw.write(s);
        fw.close();
    }
}
