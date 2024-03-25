package com.abstraction;

public class AbstractPerson {

	public static void main(String[] args) {
		Student s = new Student();
        Teacher t = new Teacher();

        System.out.println("Student speaks:");
        s.speak();
 
        System.out.println("Teacher speaks:");
        t.speak();
	}
}
