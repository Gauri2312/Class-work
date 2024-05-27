package com.threading;

public class Account extends Thread {
static int balance = 1000;
public void run() 
 {
	synchronized (Account.class)
	{
		if(balance>=800) 
		{
			System.out.println(Thread.currentThread().getName()
					+"Your balance is"+balance
					+"as you can withdraw the amount");
			try 
			{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			balance=200;
			System.out.println(Thread.currentThread().getName()+"After withdrawl your balalnce is"+balance);
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+"your balance is"+balance+"as u can't withdraw amount");
		}
	}
  }
}