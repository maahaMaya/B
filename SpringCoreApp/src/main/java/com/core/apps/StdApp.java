package com.core.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.beans.Student;

public class StdApp {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config2.xml"); 

		Student std = (Student)factory.getBean("stdObj");
		System.out.println("Student Name : " + std.getSname());
		System.out.println("Qualifications : " + std.getQualification());
		System.out.println("Courses : " + std.getCourses());
		System.out.println("Course and Faculty : " + std.getCourse_and_faculty());
		System.out.println("Course and Cost : " + std.getCourse_and_cost());
	}
}
