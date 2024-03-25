package com.oopexample;

public class Child1 implements DailySchedule {

	public static void main(String[] args) {
		Child1 ob=new Child1();
		ob.showInfo();
        ob.calculate();
	}

	@Override
	public void showInfo() {
		System.out.println("I wake up eary");
		
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		
	}

}
