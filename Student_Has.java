//WAP to implement aggregation between classes Student and Address.
package com.oopexample;
class Address1
{
	String city;
	String state;
	Address1(String city,String state)
	{
		this.city=city;
		this.state=state;
	}
}
public class Student_Has {
    String name;
    String college;
    Address1 add;
    Student_Has(String n, String cname, Address1 add)
    {
    	this.name=n;
    	this.college=cname;
    	this.add=add;
    }
    
	public static void main(String[] args) {
		Address1 add=new Address1("Sangli","Maharashtra");
		Student_Has s=new Student_Has("Gauri","vpimsr",add);
		System.out.println("Student name: "+s.name);
		System.out.println("College name: "+s.college);
		System.out.println("-------Address-------");
		System.out.println("City: "+s.add.city);
		System.out.println("State: "+s.add.state);

	}

}
