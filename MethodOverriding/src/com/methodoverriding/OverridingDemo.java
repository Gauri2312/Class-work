package com.methodoverriding;

class Base
{
	public void display()
	{
		System.out.println("hi welcome to parent class");
	}
}
public class OverridingDemo extends Base{
	public void display()
	{
		System.out.println("hi welcome to child class");
	}
	public static void main(String[] args) {
		OverridingDemo obj=new OverridingDemo();
		obj.display();
        Base bobj=new Base();
        bobj.display();
	}

}
