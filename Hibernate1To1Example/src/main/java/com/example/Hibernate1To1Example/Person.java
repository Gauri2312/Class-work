//WAP to implement one to one relationship between person and aadhar entity

package com.example.Hibernate1To1Example;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.Hibernate1To1Example.Aadhar;

@Entity
@Table(name="PersonDetails")
public class Person {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)

   private int pid;
   private String pname;
   private int contactno;
   private String email;
   
   @OneToOne(mappedBy="person",cascade=CascadeType.ALL)//this defines foreign key in Address entity
   private Aadhar aadhar;

public Person() {
	super();
	// TODO Auto-generated constructor stub
}

public Person(int pid, String pname, int contactno, String email, Aadhar aadhar) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.contactno = contactno;
	this.email = email;
	this.aadhar = aadhar;
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public int getContactno() {
	return contactno;
}

public void setContactno(int contactno) {
	this.contactno = contactno;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Aadhar getAadhar() {
	return aadhar;
}

public void setAadhar(Aadhar aadhar) {
	this.aadhar = aadhar;
}
   
  
      
}
