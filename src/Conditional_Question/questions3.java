package Conditional_Question ;
import java.util.Scanner;
 public class questions3  {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the check year:");
		int num = sc.nextInt();
		if(num % 4 == 0 && num % 100 != 0 || num % 400 == 0)
		{
			System.out.println("this is leap year :");
		}
		
		else {
			System.out.println("this is not leap year :");
		}; 
	}
	
}

