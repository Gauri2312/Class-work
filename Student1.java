//WAP to implement aggregation between classes Student and Address.
package com.oopexample;
class Address
{
	String city;
	String state;
	Address(String city,String state)
	{
		this.city=city;
		this.state=state;
	}
}
public class Student1 {
    String name;
    String college;
    Address add;
    Student1(String n, String cname, Address add)
    {
    	this.name=n;
    	this.college=cname;
    	this.add=add;
    }
    
	public static void main(String[] args) {
		Address add=new Address("Sangli","Maharashtra");
		Student1 s=new Student1("Gauri","vpimsr",add);
		System.out.println("Student name: "+s.name);
		System.out.println("College name: "+s.college);
		System.out.println("-------Address-------");
		System.out.println("City: "+s.add.city);
		System.out.println("State: "+s.add.state);

	}

}
