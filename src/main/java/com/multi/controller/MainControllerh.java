package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainControllerh {
	@RequestMapping("/")
	public String main(Model m) {
		
		return "main";
	}
	
	@RequestMapping("/about")
	public String about(Model m) {
		m.addAttribute("center","about");
		return "main";
	}
	
	@RequestMapping("/project")
	public String project(Model m) {
		m.addAttribute("center","project");
		return "main";
	}
	
	@RequestMapping("/contact")
	public String contact(Model m) {
		m.addAttribute("center","contact");
		return "main";
	}
	
	@RequestMapping("/login")
	public String login(Model m) {
		m.addAttribute("center","login");
		return "main";
	}
	
	@RequestMapping("/vi")
	public String vi(Model m) {
		m.addAttribute("center","vi");
		return "main";
	}
	
	
	@RequestMapping("/signup")
	public String signup(Model m) {
		m.addAttribute("center","signup");
		return "main";
	}		
}
