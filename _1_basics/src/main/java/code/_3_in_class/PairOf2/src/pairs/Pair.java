package pairs;
import java.util.HashMap;

public class Pair {

	public static int getNumbersOfPair(int[] arr) {
		int number = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				if(map.containsKey(arr[i])) {
					map.replace(arr[i], map.get(arr[i]) + 1);
				} else {
					map.put(arr[i], 1);
				}
				
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				if(map.containsKey(-arr[i])) {
					if(map.get(-arr[i]) > 0) {
						number++;
						map.replace(-arr[i], map.get(-arr[i]) - 1);
					}
				}
			}
		}
		return number;
		
	}
}
