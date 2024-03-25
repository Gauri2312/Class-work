/*
      1                *              i=1 i<=5  T
      1 2              * *            j=1 1<=1  T   *
      1 2 3            * * *           =2 2<=1  F   * *
      1 2 3 4          * * * *        i=2 2<=5  T
      1 2 3 4 5        * * * * *      j=1 1<=5  T
                                       =2 2<=2  T
                                       =3 3<=2  F



*/
package com.oopexample;

public class Pattern1 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
