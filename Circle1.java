package com.oopexample;

public class Circle1 extends Shape2{
    private double radius;
	public Circle1(double radius)
    {
    	this.radius=radius;
    }
	@Override
	public double getPerimeter() {
        return 2 * 3.14 * radius;
    }    
    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
	public static void main(String[] args) {
		Circle1 ob = new Circle1(3);
		ob.getPerimeter();
		ob.getArea();
		System.out.println("Perimeter of the circle: " + ob.getPerimeter());
	    System.out.println("Area of the circle: " + ob.getArea());
	}

}
