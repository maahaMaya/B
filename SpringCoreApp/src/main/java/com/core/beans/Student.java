package com.core.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	String sname;
	List<String> qualification;
	Set<String> courses;
	Map<String, String> course_and_faculty;
	Properties course_and_cost;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<String> getQualification() {
		return qualification;
	}
	public void setQualification(List<String> qualification) {
		this.qualification = qualification;
	}
	public Set<String> getCourses() {
		return courses;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	public Map<String, String> getCourse_and_faculty() {
		return course_and_faculty;
	}
	public void setCourse_and_faculty(Map<String, String> course_and_faculty) {
		this.course_and_faculty = course_and_faculty;
	}
	public Properties getCourse_and_cost() {
		return course_and_cost;
	}
	public void setCourse_and_cost(Properties course_and_cost) {
		this.course_and_cost = course_and_cost;
	}	
}
