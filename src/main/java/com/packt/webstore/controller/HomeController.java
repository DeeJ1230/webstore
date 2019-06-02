package com.packt.webstore.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Environment env;

	// @Value("${name}")
	private String name = "dan";

	// @Value("${environment}")
	private String environment = "local";

	// @Value("${dan}")
	private int dan = 66;

	@RequestMapping("/")
	public String welcome(Model model) {

	    logger.info("Welcome");

		// model.addAttribute("greeting", "Welcome to Web store, " +
		// env.getProperty("name") + "!");
		model.addAttribute("greeting", "Welcome to Web store, " + name + "! (" + dan + ")");
		model.addAttribute("tagline", "The one and only");

		return "welcome";
	}

	@RequestMapping("/welcome/greeting")
	public String greeting() {
		return "welcome";
	}
}
