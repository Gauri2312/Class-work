package com.oopexample;

public class Autoboxing {

	public static void main(String[] args) {
	  int x=25,y;
	  Integer val=new Integer(x);
	  y=val; //unboxing
	  System.out.println("value after autoboxing"+val);
	  System.out.println("value after unboxing"+y);
	}

}
