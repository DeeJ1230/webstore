package com.packt.webstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packt.webstore.model.Show;
import com.packt.webstore.service.IShowService;

@RestController
@RequestMapping("/show")
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
}
