package com.darkside.studio.movies;

public class Movie {

	Integer appearanceYear = 0;
	String name= "";
	Actor[] actors;
	
	public Movie( Integer appearanceYear, String name, Actor[] actors) {
		this.appearanceYear = appearanceYear;
		this.name = name;
		this.actors = actors;
	}

	public Integer getAppearanceYear() {
		return appearanceYear;
	}

	public void setAppearanceYear(Integer appearanceYear) {
		this.appearanceYear = appearanceYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Actor[] getActors() {
		return actors;
	}

	public void setActors(Actor[] actors) {
		this.actors = actors;
	}
	
}
