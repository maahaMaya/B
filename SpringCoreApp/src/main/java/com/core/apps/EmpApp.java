package com.core.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.beans.Employee;


public class EmpApp {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config.xml"); 

		Employee emp = (Employee)factory.getBean("empObj");
		
		System.out.println("Employee Number : " + emp.getEmpno());
		System.out.println("Employee Name : " + emp.getEname());
		System.out.println("Address Info :\n" + emp.getAdrs());
	}

}
