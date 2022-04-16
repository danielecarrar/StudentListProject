package it.dacarr.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.dacarr.students.entity.Student;
import it.dacarr.students.repository.StudentRepository;

@SpringBootApplication
public class StudentListProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentListProjectApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Student stu1= new Student("Daniele", "Elutio", "Ram@mypic.com");
		studentRepo.save(stu1);
		Student stu2= new Student("Alberto", "Derby", "Tyllo@mypic.com");
		studentRepo.save(stu2);
		Student stu3= new Student("Daniel", "Savan", "Prtoc@mypic.com");
		studentRepo.save(stu3);
		
	}

}
