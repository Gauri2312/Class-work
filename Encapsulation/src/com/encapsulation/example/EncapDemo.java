package com.encapsulation.example;

public class EncapDemo {

	public static void main(String[] args) {
		EmpEncap obj=new EmpEncap();
		obj.setId(12);
		obj.setName("Gauri");
		obj.setSal(35000.78);
		System.out.println("Emp Id: "+obj.getId());
		System.out.println("Emp name: "+obj.getName());
		System.out.println("Emp salary: "+obj.getSal());

	}

}
