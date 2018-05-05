package com.packt.webstore.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.packt.webstore.model.TvShow;

@Repository
public class TvShowRepository implements ITvShowRepository {

	@Autowired
	private IImageRepository imageRepository;

	@Override
	public List<TvShow> getAllTvShows() {
		final String fooResourceUrl = "http://192.168.0.35:8081/tvshow/titel/the";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<TvShow>> response = null;

		try {
			response = restTemplate.exchange(fooResourceUrl, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<TvShow>>() {
					});

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		List<TvShow> tvShows = response.getBody();

		return tvShows;
	}

	@Override
	public TvShow getTvShow(int id) {

		final String fooResourceUrl = "http://192.168.0.35:8081/tvshow/" + id;

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<TvShow> response = null;

		try {
			response = restTemplate.exchange(fooResourceUrl, HttpMethod.GET, null,
					new ParameterizedTypeReference<TvShow>() {
					});

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		TvShow tvShow = response.getBody();

		imageRepository.getImageUrl(tvShow);

		return tvShow;
	}
}
