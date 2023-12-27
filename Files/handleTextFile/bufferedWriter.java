package Files.handleTextFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedWriter {
    public bufferedWriter(FileWriter fw) {
    }

    public static void main(String[] args) throws IOException {
        File input = new File("./sample.txt");

        if (input.exists()) {
            input.delete();
        }

        input.createNewFile();

        FileWriter fw = new FileWriter(input);

        BufferedWriter bw = new BufferedWriter(fw);

        String s = "Varun Saketh";
        String v = " Vishnu Lalith";

        bw.write(s);
        bw.append(v);
        bw.close();
    }
}
