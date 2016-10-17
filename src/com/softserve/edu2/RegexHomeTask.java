package com.softserve.edu2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Demon on 16.10.2016.
 */
public class RegexHomeTask {
    public static void main(String[] args) {
        String s = "";
        List<String> list = new ArrayList<>();
        String text = "<html>\n" +
                "<body>\n" +
                "<p>This is the test paragraph</p>\n" +
                "<a href= http://www.zik.ua>ZIK</a>" +
                "<p>This is another test paragraph</p>" +
                "</body>\n" +
                "</html>";
        String pattern = "<p>[^<]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if (m.matches()) {
            System.out.println("Full text correspond pattern");
        } else {
            System.out.println("Full text doesn't correspond pattern. Partial corresponding text will be printed out");
        }
        m.reset();
        while (m.find()) {
            s = text.substring(m.start(), m.end());
            if (!s.isEmpty()) {
                System.out.println("Founded matching text: " + s);
                list.add(s.replace("<p>", ""));
            }
        }
        System.out.println("\n"+"The text of paragraphs is: "+ list);
    }
}
