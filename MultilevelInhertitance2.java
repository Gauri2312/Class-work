package com.oopexample;

class iPhone6
{
	void makeCalls()
	{
		System.out.println("calling functionality....");
	}
}
//getting feature of previous iphone model
class iPhone10 extends iPhone6
{
	void unlockPhoneByFaceId()
	{
		System.out.println("unlock ph by face id functionality....");
	}
}
//getting feature of previous iphone10
class iPhone12 extends iPhone10
{
	void supportFor5GNetwork()
	{
		System.out.println("%G network support....");
	}
}
public class MultilevelInhertitance2 {

	public static void main(String[] args) {
		iPhone12 iPhone= new iPhone12();
		iPhone.makeCalls();//feature reused of iphone6 for iphone12
		iPhone.unlockPhoneByFaceId();//feature reused of iphone10 for iphone12
		iPhone.supportFor5GNetwork();//additional feature 
	}

}
