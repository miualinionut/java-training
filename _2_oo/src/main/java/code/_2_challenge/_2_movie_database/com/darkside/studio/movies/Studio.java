package com.darkside.studio.movies;

public class Studio {
	
	String name = "";
	Movie[] movies;
	
	public Studio(String name, Movie[] movies) {
		this.name = name;
		this.movies = movies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Movie[] getMovies() {
		return movies;
	}

	public void setMovies(Movie[] movies) {
		this.movies = movies;
	}
	
}
