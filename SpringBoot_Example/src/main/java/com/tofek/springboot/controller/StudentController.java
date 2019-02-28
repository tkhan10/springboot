/**
 * 
 */
package com.tofek.springboot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tofek.springboot.model.Student;
import com.tofek.springboot.service.StudentService;

/**
 * @author Tofeeque
 *
 */
@Controller
public class StudentController {
	
	@RequestMapping("/")
	public String getFirstPage() {
		System.out.println("studentController-> ThymeLeaf -> getFirstPage()");
		return "welcome";
	}
	
	@RequestMapping("/list_contact")
	public String getListOfContactsPage(Model model) {
		
		StudentService studentService = new StudentService();
		List<Student> list = studentService.getStudentList();
		
		model.addAttribute("listContacts", list);
		return "listContacts";
	}

}
