package com.packt.webstore.repository;

import java.util.List;

import com.packt.webstore.model.TvShow;

public interface ITvShowRepository {
	public List<TvShow> getAllTvShows();

	TvShow getTvShow(int id);
}
