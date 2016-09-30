package com.softserve.edu;

/**
 * Created by ovo on 30.09.2016.
 */
public class Rectangle implements Figure {

	@Override
	public double perimeter(double a, double b) {
		double p = 2 * (a + b);
		return p;
	}

	@Override
	public double square(double a, double b) {
		double s = a * b;
		return s;
	}

}
