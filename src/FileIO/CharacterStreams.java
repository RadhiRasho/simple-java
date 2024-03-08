package FileIO;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreams {
    public static void characterStreams() throws Exception {

        String stream = Utilities.getPath() + "CharacterStreams.txt";
        String streamTo = Utilities.getPath() + "CharacterStreamsTo.txt";

        // if file doesn't exist to copy, create it
        Utilities.create(stream, false); // false to add content (random quote from an api)
        Utilities.create(streamTo, true); // true to not add content (this is a meant to be a copy there for leave
                                          // empty)

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader(stream);
            out = new FileWriter(streamTo);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
