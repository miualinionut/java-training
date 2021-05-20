package com.darkside.application;

import com.darkside.game.*;

public class Application {
	
	public static void main(String[] args) {
		
		Fighter fighter1 = new Fighter("A", 100, 10);
		Fighter fighter2 = new Fighter("B", 80, 12);
		
		BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);
		
		System.out.println("Winner: " + boxingMatch.fight() );
		
	}
}
