package com.example.Hibernate1ToManyExample;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Studentdetails")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
     private int sid;
     private String sname;
     private int rollno;
     
     @ManyToOne
     @JoinColumn(name="student_id")
     private StandardData sdata;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, int rollno, StandardData sdata) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.rollno = rollno;
		this.sdata = sdata;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public StandardData getSdata() {
		return sdata;
	}

	public void setSdata(StandardData sdata) {
		this.sdata = sdata;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", rollno=" + rollno + ", sdata=" + sdata + "]";
	}

	
}
