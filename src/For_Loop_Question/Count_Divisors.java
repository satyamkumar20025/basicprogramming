package For_Loop_Question;

import java.util.Scanner;

public class Count_Divisors {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        int count = 0;

	        for (int i = 1; i <= n; i++) {
	            if (n % i == 0) {
	                count++;
	            }
	        }

	        System.out.println("Number of divisors of " + n + " = " + count);
	    }
	}

