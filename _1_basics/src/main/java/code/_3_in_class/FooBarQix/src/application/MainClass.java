package application;
import java.util.HashMap;

import foo_bar_qix.FooBarQix;

public class MainClass {
	
	public static void main(String[] args) {
		HashMap<Integer, String> rules = new HashMap<Integer, String>();
		rules.put(3, "Foo");
		rules.put(5, "Bar");
		rules.put(7, "Qix");
		rules.put(0, "*");
		FooBarQix game = new FooBarQix();
		System.out.println(game.compute(rules, 105));
	}
}
