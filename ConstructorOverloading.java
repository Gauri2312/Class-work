//constructor overloading
//customer class 

package com.oopexample;
import java.util.Scanner;

class Customer {
    private String name;
    private int age; 
   //Default constructor
    public Customer() 
    {
        name="";
        age=0;
    }
   //Constructor that takes a name parameter
    public Customer(String name) 
    {
        this.name=name;
        age=0;
    }
    //Constructor that takes both name and age parameters
    public Customer(String name,int age)
    {
    	this.name=name;
    	this.age=age;
    }
    public String toString()
    {
    	return name + " " + age;
    }
}

public class ConstructorOverloading 
 {
	public static void main(String[] args) 
	{
		Customer p1 = new Customer();
		Customer p2 = new Customer("Sami");
		Customer p3 = new Customer("Sami", 18);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());    
	}
}
