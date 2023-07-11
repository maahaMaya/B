package coms.sourav.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coms.sourav.model.Student;
import coms.sourav.service.StudentService;

@RestController
//@RequestMapping("/api/v1")  // http://localhost:9091/api/v1/std
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping(value = "/std")
	public ResponseEntity<List<Student>> GetAllStdInfo() {
		return new ResponseEntity<List<Student>>(studentService.ShowAll(), HttpStatus.OK);
	}

	@PostMapping(value = "/std")
	public ResponseEntity<String> NewStudent(@RequestBody Student std) {
		if (studentService.AddStudent(std).equals("Success"))
			return new ResponseEntity<String>("New Student Details are added", HttpStatus.CREATED);
		return new ResponseEntity<String>("Error ! Student Details are not added", HttpStatus.OK);
	}

	@GetMapping(value = "/std/{id}")
	public ResponseEntity<Object> GetOneStd(@PathVariable int id) {
		Student std = studentService.SerachStd(id);
		if (std != null)
			return new ResponseEntity<Object>(std, HttpStatus.OK);
		return new ResponseEntity<Object>("Student Not Found", HttpStatus.NOT_FOUND);
	}

	@PutMapping(value = "/std/{id}")
	public ResponseEntity<Object> ModifyStudent(@RequestBody Student std, @PathVariable int id) {
		Student st = studentService.SerachStd(id);
		if (st != null) {
			st = std;
			if (studentService.UpdateStd(std).equals("Success"))
				return new ResponseEntity<Object>("Student Modified", HttpStatus.OK);
		}
		return new ResponseEntity<Object>("Student Not Found", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping(value = "/std/{id}")
	public ResponseEntity<Object> DeleteStudent(@PathVariable int id) {
		Student std = studentService.SerachStd(id);
		if (std != null) {
			studentService.DeleteStd(id);
			return new ResponseEntity<Object>("Student Deleted", HttpStatus.OK);
		}
		return new ResponseEntity<Object>("Student Not Found", HttpStatus.NOT_FOUND);
	}
}
