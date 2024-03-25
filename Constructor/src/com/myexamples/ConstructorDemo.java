package com.myexamples;

class Pet
{
	int age;// instance variable
	String name;
	Pet(String name,int age)
	{

		System.out.println("Your Pet name is:" +name+ " He is " +age+ " he is years old");
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Pet obj = new Pet("YoYo",45);
     
	}

}
