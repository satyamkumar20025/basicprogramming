package Numbar_System;

import java.util.Scanner;

public class binaryTOdecimal {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter any binary number: ");
	        int n = sc.nextInt(); // binary input as integer

	        double result = 0; // final decimal result
	        int position = 0;  // power of 2 tracker

	        while (n > 0) {
	            int digit = n % 10; // extract last digit
	            if (digit != 1) {
	            	// System.out.print("numbar is decimal"+n);
	            }
	            if (digit == 1) {
	                result = result + Math.pow(2, position);
	            }
	            position++;     // move to next binary position     
	            n = n / 10;     // remove last digit
	        }

	        System.out.print("Decimal value: " + result);
       	 System.out.print("numbar is decimal"+n);

	    }
	
}
