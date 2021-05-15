package code._4_student_effort;

import java.util.ArrayList;

public class Challenge2 {

	class Pair {
		private int integerKey;
		private String stringValue;

		public Pair(int integerKey, String stringValue) {
			this.integerKey = integerKey;
			this.stringValue = stringValue;
		}
	}

	public void writeOutputForStageOne(final int numberOfElementsToPrint) {
		for (int i = 1; i <= numberOfElementsToPrint; i++) {
			System.out.println(i + " => " + compute(i));
		}
	}

	public void writeOutputForStageTwo(final int numberOfElementsToPrint) {
		for (int i = 1; i <= numberOfElementsToPrint; i++) {
			System.out.println(i + " => " + compute2(i));
		}
	}

	private String compute(final int numberToCompute) {
		String finalWord = "";

		String bufferWord;

		ArrayList<Pair> arrayOfCorrelationsIntToWord = new ArrayList<>();

		arrayOfCorrelationsIntToWord.add(new Pair(3, "Foo"));
		arrayOfCorrelationsIntToWord.add(new Pair(5, "Bar"));
		arrayOfCorrelationsIntToWord.add(new Pair(7, "Qix"));

		for (Pair i : arrayOfCorrelationsIntToWord){
			if (numberToCompute % i.integerKey == 0) {
				finalWord += i.stringValue;
			}
		}

		bufferWord = Integer.toString(numberToCompute);
		for (int j = 0; j < bufferWord.length(); j++) {
			for (Pair i : arrayOfCorrelationsIntToWord) {
				if ((bufferWord.charAt(j) - '0') == i.integerKey) {
					finalWord += i.stringValue;
				}
			}
		}

		if (finalWord.equals("")) {
			finalWord += bufferWord;
		}

		return finalWord;
	}

	private String compute2(final int numberToCompute) {
		String finalWord = "";

		String bufferWord;
		boolean wordHasBeenAdded = false;

		ArrayList<Pair> arrayOfCorrelationsIntToWord = new ArrayList<>();

		arrayOfCorrelationsIntToWord.add(new Pair(3, "Foo"));
		arrayOfCorrelationsIntToWord.add(new Pair(5, "Bar"));
		arrayOfCorrelationsIntToWord.add(new Pair(7, "Qix"));

		for (Pair i : arrayOfCorrelationsIntToWord){
			if (numberToCompute % i.integerKey == 0) {
				finalWord += i.stringValue;
			}
		}

		bufferWord = Integer.toString(numberToCompute);
		for (int j = 0; j < bufferWord.length(); j++) {
			for (Pair i : arrayOfCorrelationsIntToWord) {
				if ((bufferWord.charAt(j) - '0') == i.integerKey) {
					finalWord += i.stringValue;
					wordHasBeenAdded = true;
				}
			}

			if (bufferWord.charAt(j) == '0') {
				finalWord += "*";
			}
		}

		if (!wordHasBeenAdded) {
			finalWord = "";
			for (int j = 0; j < bufferWord.length(); j++) {
				if (bufferWord.charAt(j) == '0') {
					finalWord += "*";
				} else {
					finalWord += bufferWord.charAt(j);
				}
			}
		}

		return finalWord;
	}
}
