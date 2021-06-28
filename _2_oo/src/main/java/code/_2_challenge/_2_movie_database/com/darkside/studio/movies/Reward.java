package com.darkside.studio.movies;

public class Reward {
	
	String name;
	Integer year;
	
	public Reward() { }

	public Reward(String name, Integer year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
