package com.abstraction;

public class ShapeArea_Interface implements Shape_Interface {

	@Override
	public double square(double side) {
		return side*side;
	}

	@Override
	public double circle(double radius) {
		return 3.14*radius*radius;
	}

	@Override
	public double rectangle(double length, double width) {
		return length*width;
	}

	@Override
	public double triangle(double base, double height) {
		return 0.5*base*height;
	}

}
