//How to increase String size in Java?
package com.oopexample;

public class String15 {

	public static void main(String[] args) {
		StringBuilder std = new StringBuilder("gauri");
        System.out.println(std);  
        System.out.println("length of std is  " + std.length());
        std.setLength(10);
        System.out.println("Increased the length to 10, string = " + std);
        System.out.println("length = " + std.length());
	}

}
