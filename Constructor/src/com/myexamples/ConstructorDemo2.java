package com.myexamples;
class Pet1
{
	int age;// instance variable
	String name;
	Pet1(String n, int a)
	{
		age = a;
		name= n;
	}
	public void display() 
	{
		System.out.println("Your Pet name is:" +name+ " He is " +age+ " he is years old");
	}
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		Pet1 obj = new Pet1("YoYo",29);
        obj.display();
	}
}

