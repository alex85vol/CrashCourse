package com.softserve.edu2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String args[]) {
		String s = "";
		List<String> list = new ArrayList<>();
		// String pattern = "[a-z\\[]+";
		// String text = "Now is the time [";
		// String pattern = "<.+>";
		// String pattern = "<[^>]+>"; // TAGS
		String pattern = ">[^<]+<";
		String text = "<p><b>Beginning with bold text</b> next, text body,<i>italic text</i> end of text.</p>";
//		String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w{2,}";
//		String text = "a1232.b_r2.c@i.ua";
		//
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		//
		if (m.matches()) {
			System.out.println("text correspond pattern");
		} else {
			System.out.println("text don't correspond pattern");
		}
		m.reset();
		//
		while (m.find()) {
			s = text.substring(m.start(), m.end());
			//s=s.substring(1, s.length()-1).trim(); // For ">[^<]+<"
			if (!s.isEmpty()) {
				System.out.print(s + "*");
				list.add(s);
			}
		}
		// System.out.println("\\");
		System.out.println("\n" + list);
	}
}
