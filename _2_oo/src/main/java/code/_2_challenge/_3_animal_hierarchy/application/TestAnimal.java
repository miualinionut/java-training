package application;

import com.darkside.animals.*;

public class TestAnimal {
	
	public static void main(String[] args) {
		 Fish d = new Fish();
	     Cat c = new Cat("Fluffy");
	     Animal a = new Fish();
	     Animal e = new Spider();
	     Pet p = new Cat("Frumii");
	     
	     d.eat();
	     d.play();
	     c.eat();
	     c.play();
	     a.eat();
	     a.walk();
	     p.play();
	     e.walk();
	}
}
