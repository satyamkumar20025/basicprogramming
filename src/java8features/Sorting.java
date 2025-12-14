package java8features;

import java.util.Arrays;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sorted--> element arranged in ascending order
		List<Integer> number = Arrays.asList(3, 1, 4, 2);
		number.stream().sorted((a ,b)->b-a).forEach(System.out::println);
		

	}

}
