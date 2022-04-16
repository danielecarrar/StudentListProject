package it.dacarr.students.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import it.dacarr.students.entity.Student;
import it.dacarr.students.repository.StudentRepository;
import it.dacarr.students.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepo;

	public StudentServiceImpl(StudentRepository studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student s) {
		return studentRepo.save(s);
		 
	}

	@Override
	public Student findById(Long id) {
		return studentRepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student s) {
		return studentRepo.save(s);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
		
	}

}
