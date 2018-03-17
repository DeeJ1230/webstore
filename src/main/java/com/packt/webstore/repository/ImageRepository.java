package com.packt.webstore.repository;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.packt.webstore.model.TvShow;
import com.packt.webstore.model.tvmaze.TvMaze;

@Repository
public class ImageRepository implements IImageRepository {

	@Override
	public void getImageUrl(TvShow tvShow) {

		// tvShow.setC00(tvShow.getC00().replace("'", ""));

		tvShow.setC00(tvShow.getC00().replace("Marvel's ", ""));

		if (tvShow.getC00().contains("("))
			tvShow.setC00(tvShow.getC00().substring(0, tvShow.getC00().indexOf("(") - 1));

		System.out.println(tvShow.getC00());

		final String fooResourceUrl = "http://api.tvmaze.com/search/shows?q=" + tvShow.getC00();

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<TvMaze>> response = null;

		System.out.println(fooResourceUrl);

		try {
			response = restTemplate.exchange(fooResourceUrl, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<TvMaze>>() {
					});

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		List<TvMaze> tvShows = response.getBody();

		tvShow.setC06("");

		for (TvMaze theShow : tvShows)
			try {
				System.out.println(theShow);
				if (theShow.getShow().getExternals().getThetvdb()
						.equals(new Integer(Integer.parseInt(tvShow.getC12())))) {
					tvShow.setC06(theShow.getShow().getImage().getMedium());
					break;
				}
			} catch (Exception e) {
				// ignore
			}
	}
}
