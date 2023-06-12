package com.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int rollno;
	private String sname;
	
	private Course curs;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Course getCurs() {
		return curs;
	}

	public void setCurs(Course curs) {
		this.curs = curs;
	}

	public Student(int rollno, 
			String sname, 
			
			@Autowired(required=true)
			@Qualifier("curObj2")
			Course curs) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.curs = curs;
	}
	
	
}
