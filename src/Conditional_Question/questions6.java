package Conditional_Question ;

import java.util.Scanner;
 public class questions6  {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the check largest number:");
		int num = sc.nextInt();
		if(num >= 18)
		{
			System.out.println(num+"this person is eligible for voting ");
		}
		
		else {
			System.out.println(num +"this person is not eligible for voting ");
		}; 
	}
	
}

