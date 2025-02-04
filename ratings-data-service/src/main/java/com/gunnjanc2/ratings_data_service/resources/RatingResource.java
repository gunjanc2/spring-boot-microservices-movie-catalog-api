package com.gunnjanc2.ratings_data_service.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gunnjanc2.ratings_data_service.models.Ratings;
import com.gunnjanc2.ratings_data_service.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
	
	@RequestMapping("/{movieId}")
	public Ratings getRating(@PathVariable("movieId") String movieId){
		 return new Ratings(movieId, 4);
	}

	@RequestMapping("users/{userId}")
		public UserRating getRatingByUser(@PathVariable("userId") String userId){
		List<Ratings> ratings = Arrays.asList(
				new Ratings("123", 3),
				new Ratings("567", 4)
				);
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
						 
	}

}
