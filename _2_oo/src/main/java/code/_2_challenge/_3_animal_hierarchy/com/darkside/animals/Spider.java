package com.darkside.animals;

public class Spider extends Animal {
    
	public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider -> eat().");
    }
}
