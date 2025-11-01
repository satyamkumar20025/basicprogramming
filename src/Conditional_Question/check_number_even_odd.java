package Conditional_Question ;
import java.util.Scanner;
 public class check_number_even_odd  {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the check number are even or odd:");
		int num = sc.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("number is even :");
		}
		
		else {
			System.out.println("number is odd :");
		}; 
	}
	
}