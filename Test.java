import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String args[]) throws Exception {
        try {
            String filename = "testout.txt";
            FileWriter fw = new FileWriter(filename, true); // the true will append the new data
            fw.write(",ass:10");// appends the string to the file
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}