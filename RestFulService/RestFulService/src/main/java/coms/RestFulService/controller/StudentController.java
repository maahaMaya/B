package coms.RestFulService.controller;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import coms.RestFulService.model.Student;

@RestController
public class StudentController {
	
	private List<Student> allStudent = new ArrayList<Student>();
	
	@GetMapping(value = "/std")
	public ResponseEntity<List<Student>> TestGet1() {
		return new ResponseEntity<List<Student>>(allStudent, HttpStatus.OK);
	}

	@PostMapping(value = "/std")
	public ResponseEntity<String> TestPost(@RequestBody Student std) {
		allStudent.add(std);
		return new ResponseEntity<String>("New Student Details are added", HttpStatus.CREATED);
	}

	@GetMapping(value = "/std/{id}")
	public ResponseEntity<Object> TestGetById(@PathVariable int id) {
		for(Student s : allStudent) {
			if(s.getRollno() == id) {
				return new ResponseEntity<Object>(s , HttpStatus.OK);
			}
		}
		return new ResponseEntity<Object>("Student Not Found", HttpStatus.NOT_FOUND);
	}
	
	@PutMapping(value = "/std/{id}")
	public ResponseEntity<Object> TestUpdateById(@PathVariable int id, @RequestBody Student std) {
		boolean result = false;
		for(Student s : allStudent) {
			if(s.getRollno() == id) {
				allStudent.remove(s);
				result = true;
				break;
			}
		}
		if(result) {
			allStudent.add(std);
			return new ResponseEntity<Object>("Student Updated" , HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Object>("Student Not Found", HttpStatus.NOT_FOUND);
		}
	}
	

	@DeleteMapping(value = "/std/{id}")
	public ResponseEntity<Object> TestDelete(@PathVariable int id) {
		boolean result = false;
		for(Student s : allStudent) {
			if(s.getRollno() == id) {
				allStudent.remove(s);
				result = true;
				break;
			}
		}
		if(result) {
			return new ResponseEntity<Object>("Student Deleted" , HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Object>("Student Not Found", HttpStatus.NOT_FOUND);
		}
	}
}
