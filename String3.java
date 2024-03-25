//String to CharArray()
package com.oopexample;

public class String3 {

	public static void main(String[] args) {
		String str = "Gauri";
        char[] chars = str.toCharArray();
        System.out.println(chars);
        for (int i= 0; i< chars.length; i++) {
            System.out.println(chars[i]);
        }

	}

}
