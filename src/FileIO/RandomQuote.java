package FileIO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RandomQuote {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String value) {
        this.content = value;
    }

    public static RandomQuote convertToRandomQuote(String data) {
        if (data == null) {
            return null;
        }

        RandomQuote randomQuote = new RandomQuote();

        String regex = "\"content\":\".*?\",";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.DOTALL | Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(data);
        String d = matcher.find() ? matcher.group().replace("\"content\":\"", "").replace("\",", "") : "";

        randomQuote.setContent(d);

        return randomQuote;
    }
}