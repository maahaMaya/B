package coms.RestFulService.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping(value = "/test1")
	public void TestGet1() {
		
	}
	
	@PostMapping(value = "/test1")
	public void TestPost() {
		System.out.println("This is Post Mapping");
	}
	
	@PutMapping(value = "/test1")
	public void TestPut() {
		System.out.println("This is Put Mapping");
	}
	
	@DeleteMapping(value = "/test1")
	public void TestDelete() {
		System.out.println("This id delete Mapping");
	}
}
