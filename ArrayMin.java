//wap to find minimum of array(accept 5 values)
package com.oopexample;

import java.util.Scanner;

public class ArrayMin {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i,min;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five elements:");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		min=a[0]; //koi b value le skte hai but for our better understanding we take it as 0.
		for(i=0;i<5;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			System.out.println(min);
		}
		System.out.println("The minimum element is:"+min);
	}

}
