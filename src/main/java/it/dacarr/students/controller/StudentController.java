package it.dacarr.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.dacarr.students.services.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	//handler method to handle list students and return model and view
	@GetMapping("/students")
	public String listStudents(Model model){
		model.addAttribute("students", studentService.getAllStudent());
		return "students";
	}
	
}
