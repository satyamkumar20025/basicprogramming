package Conditional_Question ;

import java.util.Scanner;
 public class questions4  {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the check largest number:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1<num2)
		{
			System.out.println(num2);
		}
		
		else {
			System.out.println(num1);
		}; 
	}
	
}

