package StreamApi;

import java.util.*;

public class StreamApiQuestion {

	public static void main(String[] args) {

		System.out.println("================= STREAM API SOLUTIONS =================");

		// Q1: Given a list of integers, return a list of unique even numbers sorted.
		List<Integer> nums = Arrays.asList(10, 2, 4, 2, 10, 8, 3);
		List<Integer>nums1 =nums.stream().filter(x->x%2==0).toList();
		System.out.println("Even number only"+nums1);

		// Q2: Find the string with maximum length.
		List<String> str = Arrays.asList("apple", "watermelon", "kiwi", "");

		// Q3: Check if all numbers in the list are positive.

		// Q4: Convert list of strings to list of their lengths.

		// Q5: Find sum of squares of all odd numbers.

		// Q6: Filter employees with salary > 50000 and sort them by name.

		// Q7: Group strings based on their first character.
		// System.out.println("7. Group words by first letter: " + q7(str));

		// Q8: Find the second highest number from the list.

		// Q9: Find all duplicate elements from the list.

		// Q10: Group transactions by type and calculate total amount.

		// Q11: Find the most frequent word in a sentence.

		// Q12: Find the highest paid employee in each department.

		// Q13: Find the first repeated character in a string.

		// Q14: Convert list of numbers into a map (number -> square).

		// Q15: Find top 3 highest priced orders.

	}
}
