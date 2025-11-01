package Conditional_Question ;
import java.util.Scanner;
 public class Number_positive  {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the check number are positive or negative or zero:");
		int num = sc.nextInt();
		if(num > 0)
		{
			System.out.println("number is positive :");
		}
		else if(num < 0)
		{
			System.out.println("number is negative :");
  
		}
		else {
			System.out.println("number is zero");
		};
	}
	
}