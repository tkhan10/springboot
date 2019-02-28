/**
 * 
 */
package com.tofek.springboot.service;

import java.util.ArrayList;
import java.util.List;

import com.tofek.springboot.model.Student;

/**
 * @author Tofeeque
 *
 */
public class StudentService {
	
	public void addStudent() {
		System.out.println("Test Student Service");
	}
	
	public List<Student> getStudentList() {
		System.out.println("Get Student List");
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, "tofek", "12345"));
		list.add(new Student(1, "saman", "546585"));
		
		return list;
	}

}
