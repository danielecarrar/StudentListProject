package it.dacarr.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import it.dacarr.students.entity.Student;
import it.dacarr.students.services.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	// handler method to handle list students and return model and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudent());
		return "students";
	}

	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		// create student obj to hold student form data
		Student s1 = new Student();
		model.addAttribute("student", s1);
		return "create_student";
	}

	// handle the form request
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student s) {
		studentService.saveStudent(s);
		return "redirect:/students";
	}
	// handle update request

	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.findById(id));
		return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
		// retrieve by id
		Student st = studentService.findById(id);
		st.setId(id);
		st.setName(student.getName());
		st.setSurname(student.getSurname());
		st.setEmail(student.getEmail());
		// save the new student
		studentService.updateStudent(st);

		return "redirect:/students";
	}
	
	//delete a student
	@GetMapping("students/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
		return "redirect:/students";
	}

}
