package com.rn.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rn.model.Student;
import com.rn.repo.StudentRepo;

@Controller
public class StudentController {

	@Autowired
	StudentRepo repo;

	@RequestMapping("/")
	public String getData() {
//		List<Student> studentForms = new ArrayList<Student>();
//		Student s1 = new Student();
//		s1.setFname("pavi");
//		s1.setLname("sri");
//		s1.setAddress("453 raja st");
//		s1.setPhoneno(9000);
//		model.addAttribute("studentList", studentForms);

		return "studentForms";
	}

	@RequestMapping("/addStudent")
	public Student addStudent(Student student) {
		System.out.println(student);
		repo.save(student);
		return student;
	}

}
