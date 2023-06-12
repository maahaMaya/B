package com.core.beans;

public class Address {

	private String dno;
	private String loc, phone;
	
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Door Number = " + dno + "\nLocation=" + loc + "\nPhone number=" + phone;
	}
	
	
}
