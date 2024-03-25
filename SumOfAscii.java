//Write a program in java to accept a set of any 10 characters. 
//Calculate and print the sum of Ascii codes of the characters.
package com.oopexample;

import java.util.Scanner;

public class SumOfAscii {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        System.out.println("Enter 10 characters:");
        char[] characters =new char[10];
        
        for (int i = 0; i < 10; i++) 
        {
            characters[i] = sc.next().charAt(0);
            
        }
        int sum = 0;
        for(char c: characters)
        {
        	sum += (int) c;
        }
        System.out.println("Sum of ASCII codes of the characters: " + sum);      
	}

}
