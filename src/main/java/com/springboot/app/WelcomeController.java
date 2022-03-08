package com.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.WelcomeService;

@RestController
public class WelcomeController {
	
	@Autowired
	WelcomeService ws;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return ws.serviceMessage();
	}

}

