package com.softserve.edu1;

import java.util.ArrayList;
import java.util.List;

public class Appl7 {
	public static void main(String[] args) {
		List<Integer> iL = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			iL.add(i);
		}
		System.out.println("iL=" + iL);
		//
		Object[] oa = iL.toArray(); // create an Object array
		//
		Integer[] ia2 = new Integer[3];
		ia2 = iL.toArray(ia2);
		//
		ia2[1] = 12;
		oa[1] = new Integer(22);
		//
		for (int i = 0; i < ia2.length; i++) {
			System.out.println("ia: " + ia2[i] + "  oa: " + oa[i]);
		}
		System.out.println("iL=" + iL);
	}
}
