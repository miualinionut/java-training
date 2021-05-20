package com.darkside.application;

import com.darkside.studio.movies.*;

public class Application {

	public static void main(String[] args) {
		 	Reward oscar1990 = new Reward("oscar", 1990);
		 	Reward oscar2000 = new Reward("oscar", 2000);
		 	Reward oscar2010 = new Reward("oscar", 2010);
		 	Reward oscar2018 = new Reward("oscar", 2018);

	        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Reward[]{oscar1990, oscar2000});
	        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Reward[]{oscar2010});
	        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Reward[]{oscar2018});
	        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Reward[]{});
	        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Reward[]{});
	        Actor actorFaraPremii03 = new Actor("actor fara oscar 02", 20, new Reward[]{});

	        Movie film1 = new Movie(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
	        Movie film2 = new Movie(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
	        Movie film3 = new Movie(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
	        Movie film4 = new Movie(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
	        Movie film5 = new Movie(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

	        Studio studio1 = new Studio("MGM", new Movie[]{film1, film2});
	        Studio studio2 = new Studio("Disney", new Movie[]{film3, film4, film5});

	        Studio[] studioDatabase = new Studio[]{studio1, studio2};
	        
	        System.out.println(StudioHelper.getStudiosNameWithMoreThanTwoMoviesPublished(studioDatabase)[0]); 
	        System.out.println(StudioHelper.getStudiosNameWithPlayThisActor(studioDatabase, "actor cu 2 oscaruri")[0]);
	        System.out.println(StudioHelper.getMoviesNameWitchPlaysActorsWithAgeAbove50(studioDatabase).length);
	 }
}
