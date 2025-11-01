package ArrayQuestion;

import java.util.Scanner;

public class sum {

	 public static void main(String[] args) {
	        int arr[] = new int[7];
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter 7 integers:");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt(); // Read each element into the array
	        }
           int sum=0;
	        System.out.println("Your array elements:");
	        for (int num : arr) {
	        	sum+=num;
	            System.out.println(num); // Print each element
	        }

	        
	    }
	}
