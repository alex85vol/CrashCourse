package com.softserve.edu;

import com.sun.corba.se.spi.extension.ZeroPortPolicy;
import sun.awt.geom.Crossings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Appl {

    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        int num = 0;
        int i = 1;
        List<String> figures = new ArrayList<>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String answer = null;
        do {

            try {
                System.out.println("Please enter number of figures (1...9): ");
                num = Integer.parseInt(console.readLine());
                do {
                    System.out.println(
                            "Please enter name of figure number" + i + ". It should consist of 'square' or 'rectangle' word on the begining: ");
                    figures.add(console.readLine().toUpperCase());
                    i++;
                } while (figures.size() < num);
                System.out.print("Please enter value for A side of figure: ");
                a = Double.parseDouble(console.readLine());
                System.out.print("Please enter value for B side of figure: ");
                b = Double.parseDouble(console.readLine());
            } catch (Exception e) {
                System.out.println("Error input");
            }

            Rectangle rec = new Rectangle();
            Square squ = new Square();

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
            System.out.println("Do you want to continue with new figures and values: ");
            try {
                answer = console.readLine().toUpperCase();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        while (answer.equals("Y"));


    }
}