package com.packt.webstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.model.TvShow;
import com.packt.webstore.repository.ITvShowRepository;

@Service
public class TvShowService implements ITvShowService {

	@Autowired
	private ITvShowRepository tvShowRepository;

	@Override
	public List<TvShow> listAllTvShows() {
		return tvShowRepository.getAllTvShows();
	}

	@Override
	public TvShow getTvShows(int id) {
		return tvShowRepository.getTvShow(id);
	}

}
