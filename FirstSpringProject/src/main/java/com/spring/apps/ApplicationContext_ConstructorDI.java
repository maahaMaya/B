package com.spring.apps;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Employee;
import com.spring.bean.Student;

public class ApplicationContext_ConstructorDI {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("configConstructor.xml"); 

		Employee emp = (Employee)factory.getBean("empObj");
		
		System.out.println("Employee Number : " + emp.getEmpno());
		System.out.println("Employee Name : " + emp.getEname());
		System.out.println("Employee Job : " + emp.getJob());
		System.out.println("Employee Salary : " + emp.getSalary());
	}

}
