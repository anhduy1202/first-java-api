package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Student;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	public List<Student> hello() {
		Student myStudent = new Student(
				1L,
				"Daniel",
				"anhduy@gmail.com",
				"something",
				LocalDate.of(2000, Month.JANUARY, 5),
				21);
		return List.of(myStudent);
	}

}
