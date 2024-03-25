//How to get a list of Strings in Java?
package com.oopexample;

import java.util.Arrays;
import java.util.List;

public class String13 {

	public static void main(String[] args) {
		 List<String> list = Arrays.asList("Gauri", "Lakade", "QA");
	        String split = "";
	 
	        String str = String.join(split, list);
	        System.out.println(str);
	}

}
