//WAP to find second largest and third minimum  element from the array
package com.oopexample;

import java.util.Scanner;

public class SeclargeThirdMini {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i,temp,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five numbers:");
        for(i=0;i<5;i++)
        {
        	a[i]=sc.nextInt();
        }
        System.out.println("Descending order of numbers are:");
        for(i=0;i<5;i++)
        {
        	for(j=i+1;j<5;j++)
        	{
        		if(a[i]<a[j])
        		{
        			temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        		}
        	}
        	System.out.println(a[i]);
        }
        System.out.println("Second maximum number is: "+a[1]);
        System.out.println("Third minimum number is: "+a[2]);
	}

}
