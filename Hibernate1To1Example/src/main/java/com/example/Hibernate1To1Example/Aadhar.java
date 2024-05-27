//WAP to implement one to one relationship between person and aadhar entity

package com.example.Hibernate1To1Example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="AadharDetails")
public class Aadhar {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
      private int srno;
      private int aid;
      private String aname;
      
      @OneToOne
      @JoinColumn(name="person_id")
      private Person person;

	
	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public String toString() {
		return "Aadhar [srno=" + srno + ", aid=" + aid + ", aname=" + aname + ", person=" + person + "]";
	}


	}