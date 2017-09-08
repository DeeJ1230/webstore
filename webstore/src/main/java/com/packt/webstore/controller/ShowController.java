package com.packt.webstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packt.webstore.model.Show;

@RestController
@RequestMapping(value="/show", produces=MediaType.APPLICATION_JSON_VALUE)
public class ShowController {
	
	// @Autowired
	// private IShowService showService;
	
	@RequestMapping("/list")
	public List<Show> listshows() {
		ArrayList<Show> list = new ArrayList<>();
		list.add(new Show("The Mist", "Sci-fi"));
		list.add(new Show("Game of Thrones", "Sci-fi"));
		return list;
	}
	
	@RequestMapping("/show")
	public Show getshow() {
		return new Show("Game of Thrones", "Sci-fi");
	}
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	
	
}
