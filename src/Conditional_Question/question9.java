package Conditional_Question;

import java.util.Scanner;

public class question9 {
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the check number are divisible by 3 and 5:");
			int num = sc.nextInt();
			if(num%3==0)
			{
				System.out.println("number divisible by 3 :");
			}
			else if(num%5==0)
			{
				System.out.println("number divisible by 5 :");
	  
			}
			else {
				System.out.println("invalid number");
			};
		}
		
	}

