package com.gunnjanc2.movie_info_service.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gunnjanc2.movie_info_service.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@RequestMapping("/{movieId}")
	public List<Movie> getMovieList(@PathVariable("movieId") int movieId){
		return Collections.singletonList(
				new Movie(1, "Movie 1", "Movie Desc 1")
				);
	}

}
