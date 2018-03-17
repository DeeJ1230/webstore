package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.service.ITvShowService;

@Controller
@RequestMapping(value = "/tvshows")
public class TvShowController {

	@Autowired
	private ITvShowService tvShowService;

	@RequestMapping
	public String list(Model model) {
		model.addAttribute("tvshows", tvShowService.listAllTvShows());
		return "tvshows";
	}

	@RequestMapping("/{id}")
	public String getTvShow(Model model, @PathVariable("id") int id) {
		model.addAttribute("tvshow", tvShowService.getTvShows(id));
		return "tvshow";
	}
}
