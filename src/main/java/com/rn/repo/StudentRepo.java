package com.rn.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rn.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	

}
