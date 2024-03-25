package com.oopexample;

class Parent
{
	public void show()
	{
		System.out.println("It is parent class show");
	}
}
class Child extends Parent
{
	@Override
	public void show()
	{
		System.out.println("It is child class show");
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.show();
		Parent obj1=new Parent();
		obj1.show();

	}

}
