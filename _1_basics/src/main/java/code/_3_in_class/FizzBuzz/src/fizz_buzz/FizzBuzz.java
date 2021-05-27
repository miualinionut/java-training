package fizz_buzz;

public class FizzBuzz {
	
	public static String getValue(int number) {
		if (number % 5 == 0 && number % 3 == 0) {
			return "FizzBuzz";
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
