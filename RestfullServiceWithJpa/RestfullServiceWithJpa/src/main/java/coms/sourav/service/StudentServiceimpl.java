package coms.sourav.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.sourav.model.Student;
import coms.sourav.repo.StudentRepo;

@Service
public class StudentServiceimpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public String AddStudent(Student std) {
		String res = "err";
		Student s = studentRepo.save(std);
		if (s != null) {
			res = "Success";
		}
		return res;
	}

	@Override
	public List<Student> ShowAll() {
		return studentRepo.findAll();
	}

	@Override
	public Student SerachStd(int rno) {
		Optional<Student> stdRes = studentRepo.findById(rno);
		if (stdRes.isPresent()) {
			return stdRes.get();
		}
		return null;
	}

	@Override
	public String UpdateStd(Student std) {
		String res = "err";
		Student s = studentRepo.saveAndFlush(std);
		if (s != null) {
			res = "Success";
		}
		return res;
	}

	@Override
	public void DeleteStd(int rno) {
		studentRepo.deleteById(rno);
	}

}
