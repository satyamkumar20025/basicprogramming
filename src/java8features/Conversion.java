package java8features;

import java.util.ArrayList;
import java.util.List;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numbers = new ArrayList<>();
		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");

		List<String> digit = new ArrayList<>();
		digit.add("1");
		digit.add("2");
		digit.add("3");
		List<String> result = new ArrayList<>();

		// One 1
		// two 2
		// three 3
//	numbers.forEach((n)->digit.add(digit.get(digit.indexOf(++j))+" "+numbers.get(numbers.indexOf(n))));
//			result.forEach(n->System.out.println(n));

		for (int i = 0; i < numbers.size(); i++) {
			result.add(numbers.get(i) + " " + digit.get(i));
		}
		result.forEach(n -> System.out.println(n));

	}

}
