package com.collectibot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerAPI {
	
	@RequestMapping("/RESTAPI")
	public String restTest() {
		return "Hello!";
	}

}
