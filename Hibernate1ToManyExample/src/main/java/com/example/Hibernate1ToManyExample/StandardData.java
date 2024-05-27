package com.example.Hibernate1ToManyExample;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="classDetails")

public class StandardData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int srno;
	private String className;
	private int div;
	
	@OneToMany(mappedBy="sdata",cascade=CascadeType.ALL)
	private List<Student> students=new ArrayList<Student>();

	public StandardData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StandardData(int srno, String className, int div, List<Student> students) {
		super();
		this.srno = srno;
		this.className = className;
		this.div = div;
		this.students = students;
	}

	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getDiv() {
		return div;
	}

	public void setDiv(int div) {
		this.div = div;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "StandardData [srno=" + srno + ", className=" + className + ", div=" + div + ", students=" + students
				+ "]";
	}

	
	

}
