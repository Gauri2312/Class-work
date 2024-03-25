// Java String split()
package com.oopexample;

public class String7 {

	public static void main(String[] args) {
		 String str = "Thexyzwebsitexyzisxyzsoftwaredeveloperxyzhelp";
	        String[] split = str.split("xyz");
	         
	        for (String obj: split) {
	            System.out.println(obj);
	        }
	}

}
