package com.gunnjanc2.movie_catalog_service.resources;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.gunnjanc2.movie_catalog_service.models.CatalogItem;
import com.gunnjanc2.movie_catalog_service.models.Movie;
import com.gunnjanc2.movie_catalog_service.models.Ratings;
import com.gunnjanc2.movie_catalog_service.models.UserRating;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private WebClient.Builder webClientBuilder;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalogItems(@PathVariable("userId") String userId){

		//get all rated movie ids
		UserRating ratings = restTemplate.getForObject("http://localhost:8083/ratingsdata/users/"+userId, UserRating.class);
		return ratings.getUserRating()
				.stream()
				.map(rating -> {
					//for each movie id, call movie info service and get details
					Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
					//put them all together
					return new CatalogItem(movie.getMovieName(), "Desc1", rating.getMovieRating());
				})
				.collect(Collectors.toList());

	}

}


/*
 * Movie movie = webClientBuilder.build()
							.get() //method - get, put, post, etc...
							.uri("http://localhost:8082/movies/"+rating.getMovieId())
							.retrieve()
							.bodyToMono(Movie.class) //Asynchronous activity, it says it will give you an obj in future, not now
							.block(); //blocking execution till Asynchronous job is complete, Mono is fulfilled making it Asynch to Synch
							
							*/
