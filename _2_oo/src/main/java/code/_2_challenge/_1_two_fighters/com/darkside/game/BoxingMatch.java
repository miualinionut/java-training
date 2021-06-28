package com.darkside.game;

public class BoxingMatch {
	
	Fighter fighter1;
	Fighter fighter2;
	
	public BoxingMatch(Fighter fighter1, Fighter fighter2) {
		this.fighter1 = fighter1;
		this.fighter2 = fighter2;
	}
	
	public String fight() {
		boolean ok = false;
		while(fighter1.getHeath() > 0 && fighter2.getHeath() > 0 ) {
			if(ok) {
				fighter2.attack(fighter1);
				ok = false;
			} else {
				fighter1.attack(fighter2);
				ok = true;
			}
		}
		return (fighter1.getHeath() > 0) ? fighter1.getName() : fighter2.getName();
		
	}
	
}
