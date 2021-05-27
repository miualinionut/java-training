package fizz_buzz;

public class RequirmentsFizzBuzz {

	public static String getValue(int number) {
		if (number % 5 == 0 && number % 3 == 0) {
			return "FizzBuzz";
		} else if (number % 11 == 0) {
			return "Jazz";
		} else if (number % 7 == 0) {
			return "Rizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else {
			return "" + number;
		}
	}
	
	public static void displayFirstXNumbers(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.print(getValue(i) + " ");
		}
	}
}
