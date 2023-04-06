package lesson9;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static final String ALL_CYRILLIC_STRINGS = "[\\u0410-\u044f\\u0451\u0401]+";
    public static void main(String[] args) {
        System.out.println("375111223341".matches("\\d{12}"));
        String strings = "мама";

        System.out.println(strings.matches((ALL_CYRILLIC_STRINGS)));

        Pattern pattern = Pattern.compile(ALL_CYRILLIC_STRINGS);
        String text = "I love football и пиво";

        final Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }
    }
}
