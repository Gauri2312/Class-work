package com.oopexample;

class MyArea
{
	public int area(int s)
	{
		int areaSquare=s*s;
		return areaSquare;
	}
	public void area()
	{
		int l=10,b=32;
		int area= l*b;
		System.out.println("The area is"+area);
	}
	public double sum(int a,double b)
	{
		double c = a+b;
		return c;
	}
}
public class ReturnDemo {

	public static void main(String[] args) {
		MyArea obj = new MyArea();
		obj.area();
		System.out.println(obj.area(6));
		System.out.println("area of square is" +obj.area(5));
        
		System.out.println(obj.sum(65, 45.7));
	}

}
