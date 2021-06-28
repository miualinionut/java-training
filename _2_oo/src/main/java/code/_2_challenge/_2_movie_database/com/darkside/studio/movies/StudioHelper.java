package com.darkside.studio.movies;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class StudioHelper {

	Studio[] studios;
	
	static public String[] getStudiosNameWithMoreThanTwoMoviesPublished(Studio[] studioDatabase) {
		List<String> namesList = new ArrayList<>();
		
		for (Studio iterator: studioDatabase) {
			if (iterator.movies.length > 2) {
				namesList.add(iterator.name);
			}
		}
		
		String[] names = new String[namesList.size()];
		for (int index = 0; index < names.length; index++) {
			names[index] = namesList.get(index);
		}
		return names;
	}
	
	static public String[] getStudiosNameWithPlayThisActor(Studio[] studioDatabase, String actorName) {
		HashSet<String> namesList = new HashSet<>();
		for (Studio studio: studioDatabase) {
			for (Movie movie : studio.movies) {
				for (Actor actor : movie.actors) {
					if (actor.name.equalsIgnoreCase(actorName)) {
						namesList.add(studio.name);
					}
				}
			}
		}
		
		String[] names = new String[namesList.size()];
		int index = 0;
		for (String name : namesList) {
			names[index++] = name;
		}
		return names;
	}
	
	static public String[] getMoviesNameWitchPlaysActorsWithAgeAbove50(Studio[] studioDatabase) {
		HashSet<String> namesList = new HashSet<>();
		for (Studio studio: studioDatabase) {
			for (Movie movie : studio.movies) {
				for (Actor actor : movie.actors) {
					if (actor.age > 50) {
						namesList.add(movie.name);
					}
				}
			}
		}
		
		String[] names = new String[namesList.size()];
		int index = 0;
		for (String name : namesList) {
			names[index++] = name;
		}
		return names;
	}
	
}
