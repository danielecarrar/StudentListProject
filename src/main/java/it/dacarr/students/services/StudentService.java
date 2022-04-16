package it.dacarr.students.services;


import java.util.List;

import it.dacarr.students.entity.Student;

public interface StudentService {

	List<Student> getAllStudent();
	Student saveStudent(Student s);
	Student findById(Long id);
	Student updateStudent(Student s);
}
