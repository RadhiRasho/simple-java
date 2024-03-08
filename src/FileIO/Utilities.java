package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;

public class Utilities {
    public static File create(String path, Boolean noContent) throws Exception {
        File file = new File(path);

        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());

            if (noContent) {
                return file;
            }

            FileWriter out = new FileWriter(file);

            String quote = getQuote().getContent();
            for (int i = 0; i < quote.length(); i++) {
                out.write(quote.charAt(i));
            }
            out.close();
        } else {
            System.out.println("File already exists");
        }

        return file;
    }

    public static String getPath() throws Exception {
        return "./src/FileIO/text-files/";
    }

    public static RandomQuote getQuote() throws Exception {
        URI uri = new URI("https://api.quotable.io/quotes/random");
        HttpURLConnection con = (HttpURLConnection) uri.toURL().openConnection();
        con.setRequestMethod("GET");

        int status = con.getResponseCode();

        if (status == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

            String inputline;
            StringBuffer content = new StringBuffer();

            while ((inputline = in.readLine()) != null) {
                content.append(inputline);
            }

            return RandomQuote.convertToRandomQuote(content.toString());
        }

        return null;
    }
}
