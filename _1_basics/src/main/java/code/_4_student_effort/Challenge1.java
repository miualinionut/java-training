package code._4_student_effort;

import code._2_challenge._1_fizzbuzz.FizzBuzz;

public class Challenge1 {

	public void printNumbersForStageOne(final int numberOfElementsToPrint) {

		for (int i = 1; i < numberOfElementsToPrint; i++) {
			System.out.print(changeFromIntToStringFizzBuzz(i) + " ");
		}
		System.out.println(changeFromIntToStringFizzBuzz(numberOfElementsToPrint));
	}

	public void printNumbersForStageTwo(final int numberOfElementsToPrint) {

		for (int i = 1; i < numberOfElementsToPrint; i++) {
			System.out.print(changeFromIntToStringFizzBuzzRizzJazz(i) + " ");
		}
		System.out.println(changeFromIntToStringFizzBuzzRizzJazz(numberOfElementsToPrint));
	}

	private String changeFromIntToStringFizzBuzz(final int number) {
		String finalWord = "";

		if (number % 3 == 0) {
			finalWord += "Fizz";
		}

		if (number % 5 == 0) {
			finalWord += "Buzz";
		}

		if (finalWord.equals("")) {
			finalWord += Integer.toString(number);
		}

		return finalWord;
	}

	private String changeFromIntToStringFizzBuzzRizzJazz(final int number) {
		String finalWord = "";

		if (number % 3 == 0) {
			finalWord += "Fizz";
		}

		if (number % 5 == 0) {
			finalWord += "Buzz";
		}

		if (number % 7 == 0) {
			finalWord += "Rizz";
		}

		if (number % 11 == 0) {
			finalWord += "Jazz";
		}

		if (finalWord.equals("")) {
			finalWord += Integer.toString(number);
		}

		return finalWord;
	}
}
