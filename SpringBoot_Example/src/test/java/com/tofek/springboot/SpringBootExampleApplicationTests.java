package com.tofek.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tofek.springboot.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootExampleApplicationTests {

	@Mock
	private StudentService studentService;

	@Test
	public void contextLoads() {
		studentService.addStudent();
	}

}
