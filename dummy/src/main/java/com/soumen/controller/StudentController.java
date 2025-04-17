package com.soumen.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.soumen.model.Student;
import com.soumen.service.StudentService;

@Controller
public class StudentController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String showForm(Model model) {
        model.addAttribute("studentObject", new Student());
        return "index";
    }
	
	@PostMapping("/submitForm")
	public String submitForm(
			@ModelAttribute("studentObject")
			Student student, 
			BindingResult result, 
			Model model) 
	{
		Student existingStudent = studentService.findStudentByIdAndRoll(student.getStudentID(), student.getRoll());
		if(existingStudent == null) {
			studentService.createStudent(student);
		}
		else studentService.updateStudent(student);
		
		model.addAttribute("isSuccess", true);
		model.addAttribute("roll", student.getRoll());
		model.addAttribute("studentID", student.getStudentID());
		
//		return "index";
		return "redirect:/?updateSucess";
	}
}
