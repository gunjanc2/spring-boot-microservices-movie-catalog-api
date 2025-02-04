package com.gunnjanc2.ratings_data_service.models;

import java.util.List;

public class UserRating {

	private List<Ratings> userRating;

	public List<Ratings> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Ratings> userRating) {
		this.userRating = userRating;
	}
	
}
