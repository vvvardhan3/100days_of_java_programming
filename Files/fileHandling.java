package Files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;




public class fileHandling {
    public static void fileOperations() throws IOException {
        File f = new File("/Users/vishnuvardhanvankayalapati/Desktop/100days_of_java_programming/Files/srcfiles/Sample.pdf");
        // f.createNewFile(); --> Creates File!
        

        /* If the 'Vishnu.pdf' exists, then delete it from the folder */
        // if (f.exists()) {
        //     f.delete();
        // } 

    
    /* System.out.println(f.isHidden()); 
    --> If the file in the folder is hidden, Then it returns true. */

    // System.out.println(f.canWrite()); --> 
    // Checks, Weather the file has Write Operations, If it has it, Then it returns true!
    
    // System.out.println(f.setWritable(true)); 
    // --> This Operation gives Writable Operations to the file

    // System.out.println(f.length()); --> It returns 'Length' of the file
    // System.out.println(f.getAbsolutePath()); --> It returns 'AbsolutePath' of the file
    // System.out.println(f.getParentFile()); --> It returns 'Parent Path' of the file
    
    }

    public static void directoryOperations() throws IOException{
        File f = new File("/Users/vishnuvardhanvankayalapati/Desktop/100days_of_java_programming/Files/srcfiles/");
        // System.out.println(f.mkdir()); --> Returns New Directory, If don't exists
        // System.out.println(f.delete()); --> It deletes current Directory
        // System.out.println(f.mkdirs()); --> It creates multiple directories at single attempt
        // System.out.println(Arrays.toString(f.list())); --> It returns list of files in a directory
        // System.out.println(Arrays.toString(f.listFiles())); --> It returns each file path in the directory
        // System.out.println(f.getName()); --> It returns file name only
        // System.out.println(f.getAbsolutePath()); --> It returns the Absolute path of the directory
        // System.out.println(f.getParent()); --> It returns 'Parent Path' of the given directory
        // System.out.println(f.lastModified()); --> It returns the 'lastModified date' in 'long format'
        // System.out.println(new Date(f.lastModified())); --> This returns the absolute last modified date
        // System.out.println(f.isFile()); --> Returns 'True' if it is a file
    }




    public static void main(String[] args) throws IOException {
        fileOperations();
        directoryOperations();
    }
    
}
