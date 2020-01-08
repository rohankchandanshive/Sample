package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepo;

	
	@GetMapping("/students")
	public List<Student> findAll(){
		return studentRepo.findAll();
	}
	
	@GetMapping("/byname")
	public Page<Student> findByName(@RequestParam String name,@RequestParam Optional<Integer> page,@RequestParam Optional<Integer>sort){
		return studentRepo.findByName(name,PageRequest.of(page.orElse(0), 5,Sort.by("id")));
	}
	
	@PostMapping("/addStudents")
	public Student createStudent(@RequestBody Student student) {
		return studentRepo.save(student);
		
	}
	
	
}
