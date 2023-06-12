package com.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int empno;
	private String ename;
	
	private Address adrs;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAdrs() {
		return adrs;
	}

	@Autowired(required=true)
	@Qualifier("adrs2")
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}
	
	
}
