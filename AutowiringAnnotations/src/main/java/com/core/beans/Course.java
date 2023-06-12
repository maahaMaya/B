package com.core.beans;

public class Course {
	private String cname;
	private String duration;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public Course(String cname, String duration) {
		super();
		this.cname = cname;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course Name =" + cname + "\nduration=" + duration;
	}
	
	
}
