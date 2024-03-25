package com.oopexample;

public class Rectangle1 extends Shape1{
	private double len,breadth; //instance variable
	//we have constructor to initialize the instance variable
    public Rectangle1(double len, double breadth) {
		super();
		this.len = len;
		this.breadth = breadth;
	}
    @Override
    public double getArea()
    {
    	return this.len*this.breadth;
    }
	    
	public static void main(String[] args) {
		//constructor gets called automatically when object is created
		Rectangle1 rec=new Rectangle1(4.5,7);
        System.out.println("The area is "+rec.getArea());
        double area=rec.getArea();
        System.out.println("The area of rect is " +area);    
	}

}
