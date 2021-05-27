package foo_bar_qix;
import java.util.HashMap;
import java.util.Stack;

public class FooBarQix {

	public static String compute(HashMap<Integer, String> rules, int number) {
		String str = "";
		for (Integer i : rules.keySet()) {
			  if(i != 0 && number % i == 0) {
				  str += rules.get(i);
			  }
			}
	    Stack<Integer> stack = new Stack<>();
	    while(number != 0) {
	    	stack.add(number % 10);
	    	number /= 10;
	    }
	    
	    while(!stack.empty()) {
	    	str += rules.getOrDefault((Integer)stack.pop(), "");
	    }
		return str;
	}
}
