package com.softserve.edu1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDups {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		Set<String> s = new HashSet<>();
		for (int i = 0; i < args.length; i++) {
			if (!s.add(args[i])) {
				System.out.println("Duplicate detected: " + args[i]);
				list.add(args[i]);
			}
		}
		System.out.println(s.size() + " distinct words detected: " + s);
		System.out.println("Duplicate: " + list);
	}
}
