package com.darkside.game;

public class Fighter {
	
	private String name;
	private float heath;
	private float damagePerAttack;
	
	public Fighter(String name, float heath, float damagePerAttack) {
		this.name = name;
		this.heath = heath;
		this.damagePerAttack = damagePerAttack;
	}
	
	public void attack(Fighter opponent) {
		opponent.heath -= damagePerAttack;
		if(opponent.heath < 0) {
			opponent.heath = 0;
		}
 	}

	public String getName() {
		return name;
	}

	public float getHeath() {
		return heath;
	}

	public float getDamagePerAttack() {
		return damagePerAttack;
	}
	
}
