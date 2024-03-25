//Write a program to print sum values of an array

package com.oopexample;

public class SumOfArray {

	public static void main(String[] args) {
		int i,sum=0;
		int num[] = {1,2,3,4,5,6};
		for(i=1;i<num.length;i++)
		{
			sum = sum+num[i];
		}
    System.out.println("Sum of array values: "+sum);
	}

}
