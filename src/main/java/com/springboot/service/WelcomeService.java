package com.springboot.service;

import org.springframework.stereotype.Component;

// define bean by using @Service or @Component
@Component
public class WelcomeService{
	public String serviceMessage() {
		return "Good Morning moved and updated!!" ;
	}
}