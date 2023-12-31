package ExceptionHandling.practiceProblems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class assignment3 {

    public static void readFile() throws FileNotFoundException {
        File input = new File("./sample.txt");

        // To read the file
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        // If we dont have the input file, then it returns FileNotFoundException Path
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + input.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.err.println(e.toString());
        }
    }
}
