//two ways to create thread a)by extending Thread class
//or b)by using runnable interface
package com.threading;

public class ThreadDemo1 extends Thread{

	public void run()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println("Thread is running");
		System.out.println("The addition is: "+c);
	}
	public static void main(String[] args) {
		ThreadDemo1 obj = new ThreadDemo1();
		obj.start();

	}

}
