package com.gunnjanc2.ratings_data_service.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gunnjanc2.ratings_data_service.models.Ratings;

@RestController
@RequestMapping("/ratings")
public class RatingResource {
	
	@RequestMapping("/{movieId}")
	public List<Ratings> getRatings(@PathVariable("movieId") int movieId){
		return Collections.singletonList(
				new Ratings(1, "Movie 1", 4)
				);
				
	}

}
