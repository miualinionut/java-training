package application;

import fizz_buzz.*;

public class MainClass {
	
	public static void main(String[] args) {
		FizzBuzz game = new FizzBuzz();
		game.displayFirstXNumbers(15);
		System.out.println();
		RequirmentsFizzBuzz requirments = new RequirmentsFizzBuzz();
		requirments.displayFirstXNumbers(30);
	}
	
}
