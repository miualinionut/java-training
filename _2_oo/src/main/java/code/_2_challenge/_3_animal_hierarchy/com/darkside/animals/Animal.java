package com.darkside.animals;

public abstract class Animal {
    
	protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("Animal with " + legs + " legs is walking.");
    }
    
    public abstract void eat();
}