package com.jdbc.beans;

/*
 * CREATE TABLE CUSTOMER(
CUSTID INT auto_increment PRIMARY KEY,
CUSTNAME VARCHAR(20), 
email  varchar(100), 
phone  varchar(10));
*/
// Note :- variable name and column name of the table must be same.

public class Customer {

	private int custid;
	private String custname;
	private String email;
	private String phone;
	
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
