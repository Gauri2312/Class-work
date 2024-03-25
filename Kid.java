package com.oopexample;
class Lady
{
}
	//mother class inherited from lady class
	class Mother extends Lady
	{
		String name;
		String surname;
		//name and surname of the lady
		{
			String name="";
			String surname="";
		}
		//public constructor to set name and surname of the mother

		public Mother(String name,String surname) {
			this.name = name;
			this.surname = surname;
		}		
	}
//child class
public class Kid {
//name of the child
	static String name="";
	//setName function to set the name of child
	public void setName(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
		//creating a child object
		Kid myself =new Kid();
		//set child name
		myself.setName("Soham");
		//creating a mother object and set name and surname
		Mother mname = new Mother("Usha","Medewar");
		//printing out name and mother name
		System.out.println("My name is: "+name+" "+mname.surname);
		System.out.println("My mother's name is: "+mname.name+" "+mname.surname);
	}
}
