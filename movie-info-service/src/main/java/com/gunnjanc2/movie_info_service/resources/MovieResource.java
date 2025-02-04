package com.gunnjanc2.movie_info_service.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gunnjanc2.movie_info_service.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@RequestMapping("/{movieId}")
	public Movie getMovieList(@PathVariable("movieId") String movieId){
		return new Movie(movieId, "Name for ID "+movieId);
	}

}
