package com.abstraction;

public class AbstractionObject {

	public static void main(String[] args) {
		ShapeArea_Interface obj=new ShapeArea_Interface();
		 double squareArea = obj.square(5);
	     System.out.println("Area of square: " + squareArea);
	     double circleArea = obj.circle(3);
	     System.out.println("Area of circle: " + circleArea);
	     double rectangleArea = obj.rectangle(4, 6);
	     System.out.println("Area of rectangle: " + rectangleArea);
	     double triangleArea = obj.triangle(4, 7);
	     System.out.println("Area of triangle: " + triangleArea);
	}

}
