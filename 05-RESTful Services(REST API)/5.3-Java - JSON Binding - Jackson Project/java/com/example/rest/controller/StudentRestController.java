package com.example.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student("Leong", "Rizel"));
		students.add(new Student("Mario", "Rossie"));
		students.add(new Student("Razel", "Moore"));
		students.add(new Student("Samson", "Clich"));
		students.add(new Student("Amir", "Khan"));

		return students;
	}
}
