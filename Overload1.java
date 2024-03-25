package com.oopexample;



class Shapeee 
{
	double length;
    double width;
    
    public double getArea() 
    {
    	return 0.0;
    }
}

class Rectangle extends Shapeee 
{
    public double Rectangle(double length, double width) 
    {
    	return length * width;
    }   
}

public class Overload1 
{
    public static void main(String[] args) 
    {
        Rectangle o = new Rectangle();
        System.out.println("Area of Rectangle: " + o.getArea());
    }
}
