package com.demo.my_spring_app_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class MySpringAppTestApplication 
{
	@GetMapping("/")
	public String home()
	{
		return "Hey I am from Spring Boot Application";
	}
	public static void main(String[] args)
	{
		SpringApplication.run(MySpringAppTestApplication.class,args);
	}

}
