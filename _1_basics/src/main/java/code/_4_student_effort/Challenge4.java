package code._4_student_effort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public class Challenge4 {

	public void writeOutput() {
		int [] array = {-1, -1, -1, -1, 2, 2};

		System.out.println(getNumberOfPairsOfThree(array));
	}

	private int getNumberOfPairsOfThree(final int[] givenArray) {
		int totalNumberOfPairs = 0;

		Hashtable<Integer, ArrayList<Pair>> hashtableOfPreviousSums = new Hashtable<>();
		HashSet<Integer> visited = new HashSet<>();

		for (int i = 1; i < givenArray.length; i++) {
			if (hashtableOfPreviousSums.containsKey(-1 * givenArray[i])) {
				for (Pair pair : hashtableOfPreviousSums.get(-1 * givenArray[i])) {
					if (!visited.contains(pair.x) && !visited.contains(pair.y)) {
						visited.add(pair.x);
						visited.add(pair.y);
						visited.add(i);

						totalNumberOfPairs ++;
					}
				}
			} else {
				for (int j = 0; j < i; j++) {
					if (!visited.contains(j)) {
						if (!hashtableOfPreviousSums.containsKey(givenArray[j] + givenArray[i])) {
							hashtableOfPreviousSums.put(givenArray[j] + givenArray[i], new ArrayList<>());
						}

						hashtableOfPreviousSums.get(givenArray[j] + givenArray[i]).add(new Pair(i, j));
					}
				}
			}
		}


		return totalNumberOfPairs;
	}

	class Pair {
		int x,y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
