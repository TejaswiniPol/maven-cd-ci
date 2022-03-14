package com.springboot.controllers;

import com.springboot.service.CovidService;
import com.springboot.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@Autowired
	WelcomeService ws;

	@Autowired
	CovidService covidService;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return ws.serviceMessage();
	}

}

