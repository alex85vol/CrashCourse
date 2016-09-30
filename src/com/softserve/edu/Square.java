package com.softserve.edu;

public class Square implements Figure {

	@Override
	public double perimeter(double a, double b) {
		double p = 4 * a;
		return p;
	}

	@Override
	public double square(double a, double b) {
		double s = Math.pow(a, 2);
		return s;
	}

}
