package com.oopexample;
//Creating the base class
class BaseClass {
 int firstNum = 10;
}
//Inheriting the base class in SubClass1
class SubClass1 extends BaseClass {
 int secondNum = 1;
}
//Creating the subclass2 that inherits the base class
class SubClass2 extends BaseClass {
 int thirdNum = 2;
}
//Creating the subclass3 that inherits the base class
class SubClass3 extends BaseClass {
 int fourthNum = 3;
}

public class HierarchicalInhertance {

	public static void main(String args[]) {
	     SubClass1 childObj1 = new SubClass1();
	     SubClass2 childObj2 = new SubClass2();
	     SubClass3 childObj3 = new SubClass3();
	     System.out.println("firstNum * secondNum = " + childObj1.firstNum * childObj1.secondNum);
	     System.out.println("firstNum * thirdNum = " + childObj2.firstNum * childObj2.thirdNum);
	     System.out.println("firstNum * fourthNum = " + childObj3.firstNum * childObj3.fourthNum);
	 }

}
