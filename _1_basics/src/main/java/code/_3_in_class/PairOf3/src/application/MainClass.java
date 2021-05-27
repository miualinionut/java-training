package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class MainClass {
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		myList.add(-1);
		myList.add(-1);
		myList.add(-1);
		myList.add(2);
		myList.add(-2);
		myList.add(3);
		Collections.sort(myList);
		int noPairs = 0;
		int i = 0;
		int k = 1;
		int j = myList.size() - 1;
		if (j >= 3) {
			while(j > k) {
				if((myList.get(i) + myList.get(k) + myList.get(j) < 0)) {
					++i;
					++k;
				} else if ((myList.get(i) + myList.get(k) + myList.get(j) > 0)) {
					--j;
				} else {
					i += 2;
					j--;
					k += 2;
					noPairs++;
				}
			}
		}
		System.out.println(noPairs);
		
	}
}
