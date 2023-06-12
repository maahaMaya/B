package com.core.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.core.beans.Student;


public class StdApp {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config.xml"); 

		Student std = (Student)factory.getBean("stdObj");
		
		System.out.println("Roll Number  : " + std.getRollno());
		System.out.println("Student Name : " + std.getSname());
		System.out.println("Course Info :\n" + std.getCurs());
	}

}
