package it.dacarr.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dacarr.students.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
