package com.softserve.edu1;
import java.util.Arrays;
import java.util.List;

public class Appl6 {
	public static void main(String[] args) {
		String[] sa = { "one", "two", "three", "four" };
		List<String> sList = Arrays.asList(sa); // make a List
		//
		System.out.println("size " + sList.size());
		System.out.println("idx2 " + sList.get(2));
		//
		sList.set(3, "six"); // change List
		sa[1] = "five"; // change array
		//
		System.out.println("Array:");
		for (String s : sa) {
			System.out.print(s + " ");
		}
		System.out.println("\nList " + sList);
	}
}
