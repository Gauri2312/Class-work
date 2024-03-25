//Write a program to calculate the average value of array elements

package com.oopexample;

public class AvgOfArray {

	public static void main(String[] args) {
		int i,sum=0;
		int num[] = {1,2,3,4,5,6};
		for(i=1;i<num.length;i++)
		{
			sum = sum+num[i];
		}
		double avg =  (sum / num.length);
		System.out.println("Sum of array values: "+sum);
        System.out.println("Average of array values: "+avg);
	}
}
