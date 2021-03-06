package com.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot.*")
public class Application {
	
	public static void main(String args[]) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
	}
}
