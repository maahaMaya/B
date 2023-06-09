package com.spring.apps;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.bean.Student;

public class XmlBeanFactory_SetterDI {

	public static void main(String[] args) {
		Resource rs = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(rs);
		
		Student std = (Student)factory.getBean("stdObj");
		
		System.out.println(std.getRollno() + "\t" + std.getSname() + "\t" + std.getCourse() + "\t" + std.getFees());
	}
}
