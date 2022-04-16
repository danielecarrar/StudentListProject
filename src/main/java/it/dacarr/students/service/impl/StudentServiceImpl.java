package it.dacarr.students.service.impl;

import java.util.List;

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

}
