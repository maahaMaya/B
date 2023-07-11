package coms.sourav.service;

import java.util.*;

import coms.sourav.model.Student;

public interface StudentService {
	
	public String AddStudent(Student std);
	public List<Student> ShowAll();
	public Student SerachStd(int rno);
	public String UpdateStd(Student std);
	public void DeleteStd(int rno);	
	
}
