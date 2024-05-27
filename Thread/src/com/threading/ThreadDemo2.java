//WAP to create thread which will generate even numbers between 1 and 100
package com.threading;

public class ThreadDemo2 extends Thread {
    public void run()
    {
    	for(int i=2;i<=100;i+=2) {
    	System.out.println(i);
        }
    }
	public static void main(String[] args) {
		ThreadDemo2 obj=new ThreadDemo2();
		obj.start();
	}
}
