package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	private Environment env;
	
	@Value("${name}")
	private String name;

	@Value("${environment}")
	private String environment;

	@RequestMapping("/")
	public String welcome(Model model) {
//		model.addAttribute("greeting", "Welcome to Web store, " + env.getProperty("name") + "!");
		model.addAttribute("greeting", "Welcome to Web store, " + environment + "!");
		model.addAttribute("tagline", "The one and only");

		return "welcome";
	}

	@RequestMapping("/welcome/greeting")
	public String greeting() {
		return "welcome";
	}
}
