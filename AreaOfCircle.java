package com.oopexample;
import java.util.Scanner;
class Area
{
	int r;
	double pi=3.14;
	double AreaCircle;
	Scanner sc = new Scanner(System.in);
	public void circle()
	{
		System.out.println("Enter radius:");
		r = sc.nextInt();
	}
	public void getData()
	{
		AreaCircle=3.14*r;
		System.out.println("Area of Circle is:"+AreaCircle);
		AreaCircle=sc.nextDouble();
	}
}
public class AreaOfCircle {

	public static void main(String[] args) {
		Area obj= new Area();
		obj.circle();
		obj.getData();

	}

}
