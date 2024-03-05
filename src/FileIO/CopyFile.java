package FileIO;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {
    public static void copy() throws Exception {
        String copy = Utilities.getPath() + "_copy.txt";
        String copyTo = Utilities.getPath() + "_copyTo.txt";

        // if file doesn't exist to copy, create it
        Utilities.create(copy, false);
        Utilities.create(copyTo, true);

        FileReader in = new FileReader(copy);
        FileWriter out = new FileWriter(copyTo);

        int c;
        while ((c = in.read()) != -1) { // while not the last character
            out.write(c); // write to out file
        }

        if (in != null) {
            in.close();
        }

        if (out != null) {
            out.close();
        }
    }
}
