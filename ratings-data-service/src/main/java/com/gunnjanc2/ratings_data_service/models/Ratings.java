package com.gunnjanc2.ratings_data_service.models;

public class Ratings {
	
	private int movieId;
	private String movieName;
	private int movieRating;
	public Ratings(int movieId, String movieName, int movieRating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieRating = movieRating;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}
	
	

}
