package code._4_student_effort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Challenge3 {

	public void writeOutput () {
		int [] array = {3, 2, -3, -2, 3, 0};

		System.out.println(getNumberOfPairsFromArray(array));
	}

	private int getNumberOfPairsFromArray(int [] givenArray) {
		int totalNumberOfPairs = 0;

		HashSet<Integer> hashSet = new HashSet<>();

		for (int i = 0; i < givenArray.length; i++) {
			if (hashSet.contains(-1 * givenArray[i])) {
				hashSet.remove(-1 * givenArray[i]);
				totalNumberOfPairs++;
			} else {
				hashSet.add(givenArray[i]);
			}
		}

		return totalNumberOfPairs;
	}
}
