package com.soumen.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.soumen.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

	@Query(value="SELECT * FROM T_student  WHERE studentID LIKE ?1 AND sroll=?2", 
			nativeQuery = true)
	public Optional<Student> findById(String studentId, Integer roll);
}
