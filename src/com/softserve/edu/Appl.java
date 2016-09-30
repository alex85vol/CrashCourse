package com.softserve.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Appl {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		List<String> figures = new ArrayList<>();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader answer = new BufferedReader(new
		// InputStreamReader(System.in));
		do {

			try {
				do {
					System.out.println(
							"Please enter name of figure. It should consist of 'square' or 'rectangle' word on the begining: ");
					figures.add(console.readLine().toUpperCase());
				} while (figures.size() < 3);
				System.out.print("Please enter value for a side of figure: ");
				a = Double.parseDouble(console.readLine());
				System.out.print("Please enter value for b side of figure: ");
				b = Double.parseDouble(console.readLine());
			} catch (Exception e) {
				System.out.println("Error input");
			}
			Rectangle rec = new Rectangle();
			Square squ = new Square();

			// String figures[] = { "rectangle", "square", "rectangle" };

			for (String str : figures) {
				if (str.toLowerCase().startsWith("rectangle")) {
					System.out.println("Type of figure is " + str.toUpperCase());
					System.out.println(str.toUpperCase() + " perimeter is: " + rec.perimeter(a, b));
					System.out.println(str.toUpperCase() + " square is: " + rec.square(a, b));
				} else if (str.toLowerCase().startsWith("square")) {
					System.out.println("Type of figure is " + str.toUpperCase());
					System.out.println(str.toUpperCase() + " perimeter is: " + squ.perimeter(a, b));
					System.out.println(str.toUpperCase() + " square is: " + squ.square(a, b));
				}

			}
			    System.out.println("Do you want to continue with  figures and values: ");
			try {
				String answer = console.readLine().toUpperCase();
			} catch (IOException e) {
				e.printStackTrace();
			}


		}
			 while(answer.equals("Y"));




	}
}