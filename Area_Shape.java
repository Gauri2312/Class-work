package com.oopexample;

public class Area_Shape {
    public double area(double radius){
        double areaOfCircle=3.14*radius*radius;
        return areaOfCircle;
    }
    public int area(int side){
        int areaSquare=side*side;
        return areaSquare;
    }
    public int area(int breadth,int heigth){
        int areaRectangle=breadth*heigth;
        return areaRectangle;
    }
    public static void main(String[] args) {
        Area_Shape obj=new Area_Shape();
		System.out.println("Area of Circle: "+obj.area(5.0));
		System.out.println("Area of Square: "+obj.area(4));
		System.out.println("Area of Rectangle: "+obj.area(5, 4));
    }
}