package com.collectibot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "fellow CollectiBot!");
		return "index.jsp";
	}

}
