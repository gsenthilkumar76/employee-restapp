package com.wipro.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cicd")
@RestController
@SpringBootApplication
public class EmployeeRestappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestappApplication.class, args);
	}
@GetMapping
	public String display()
	{
		return "Welcome to my project";
	}
}
