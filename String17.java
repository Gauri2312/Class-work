//How to get String from String in Java?
package com.oopexample;

public class String17 {

	public static void main(String[] args) {
		String str = "Hey there I am misusing WhatsApp";
        String [] split = str.split(" ", 7);
  
        for (String obj : split)
            System.out.println(obj);

	}

}
