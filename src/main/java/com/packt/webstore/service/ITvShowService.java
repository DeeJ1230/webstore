package com.packt.webstore.service;

import java.util.List;

import com.packt.webstore.model.TvShow;

public interface ITvShowService {

	List<TvShow> listAllTvShows();

	TvShow getTvShows(int id);

}
