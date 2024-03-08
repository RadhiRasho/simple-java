package FileIO;

import java.io.InputStreamReader;

public class StandardStreams {
    public static void standardStream() throws Exception {
        InputStreamReader cin = null;

        try {
            cin = new InputStreamReader(System.in);

            System.out.println("Enter character 'q' to quite.");

            char c;
            do {
                c = (char) cin.read();
                System.out.println(c);
            } while (c != 'q');
        } finally {
            if (cin != null) {
                cin.close();
            }
        }
    }
}
