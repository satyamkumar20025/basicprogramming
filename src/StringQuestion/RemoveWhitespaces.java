package StringQuestion;

import java.util.Scanner;

public class RemoveWhitespaces {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter a string with spaces: ");
	        String str = sc.nextLine();

	        String noSpaces = "";

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	           
	            if (ch != ' ') {
	                noSpaces += ch;
	            }
	        }

	        System.out.println("String without spaces: " + noSpaces);
	    }
	}