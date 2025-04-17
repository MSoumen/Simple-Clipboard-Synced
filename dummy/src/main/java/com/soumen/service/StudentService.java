package com.soumen.service;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soumen.model.Student;
import com.soumen.repository.StudentRepo;
import com.soumen.util.RollNumberGenerator;

@Service
public class StudentService implements Serializable{

	private static final Long serialVersionUID = 1L;
	
	@Autowired
	private StudentRepo studentRepo;
	
	public Student createStudent(Student student) {
		Integer roll = RollNumberGenerator.generate();
		student.setRoll(roll);
		student.setStudentID(String.format("%2d%4d", roll, LocalDate.now().getYear()));
		return studentRepo.save(student);
	}
	
	public Student updateStudent(Student student) {
		Optional<Student> studentRecord = this.studentRepo.findById(student.getStudentID(), student.getRoll());
		if(studentRecord.isPresent()) {
			Student updatedStudent = studentRecord.get();
			updatedStudent.setStudentID(student.getStudentID());
			updatedStudent.setRoll(student.getRoll());
			updatedStudent.setName(student.getName());
			updatedStudent.setDept(student.getDept());
			updatedStudent.setCreatedAt(student.getCreatedAt());
			updatedStudent.setModifiedAt(student.getModifiedAt());
			
			studentRepo.save(updatedStudent);
			return updatedStudent;
		}
		else {
			System.out.println("Student record not found!");
			throw new NullPointerException("Student record not found!");
		}
		
	}

	public Student findStudentByIdAndRoll(String studentID, Integer roll) {
		// TODO Auto-generated method stub
		Optional<Student> studentList = studentRepo.findById(studentID, roll);
		if(studentList.isPresent()) {
			return studentList.get();
		}
		return null; //no student is there
	}

}
