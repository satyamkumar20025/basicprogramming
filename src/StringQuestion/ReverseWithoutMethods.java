package StringQuestion;

import java.util.Scanner;

public class ReverseWithoutMethods {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Convert string to character array
	        char[] chars = input.toCharArray();

	        // Reverse the array manually
	        for (int i = 0; i < chars.length / 2; i++) {
	            char temp = chars[i];
	            chars[i] = chars[chars.length - 1 - i];
	            chars[chars.length - 1 - i] = temp;
	        }

	        // Print reversed string
	        System.out.print("Reversed string: ");
	        for (char c : chars) {
	            System.out.print(c);
	        }

	        scanner.close();
	    }
	}

