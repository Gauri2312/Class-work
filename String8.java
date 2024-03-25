//Java String indexOf()
package com.oopexample;

public class String8 {

	public static void main(String[] args) {
		String str = "Gauri Lakade " + "performing a search";
        System.out.println(str);
        System.out.println("index of 'p' is " + str.indexOf('p'));
        System.out.println("index of 'u' is " + str.indexOf('u'));
        System.out.println("last index of 'L' is " + str.lastIndexOf('L'));
        System.out.println("last index of 's' is " + str.lastIndexOf('s'));

	}

}
