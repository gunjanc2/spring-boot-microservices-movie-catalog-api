package com.gunnjanc2.movie_catalog_service.models;

public class Ratings {
	
	private String movieId;
	private int movieRating;
	
	public Ratings() {
		
	}
	
	public Ratings(String movieId, int movieRating) {
		
		this.movieId = movieId;
		this.movieRating = movieRating;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public int getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}
	
	

}
