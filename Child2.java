package com.oopexample;

public class Child2 implements DailySchedule{

	public static void main(String[] args) {
		Child2 ob=new Child2();
		ob.showInfo();
		ob.calculate();

	}

	@Override
	public void showInfo() {
		System.out.println("I am very lazy and want to chill...");
		
	}

	@Override
	public void calculate() {
		System.out.println("I don't need money then no calculation");
		
	}

}
