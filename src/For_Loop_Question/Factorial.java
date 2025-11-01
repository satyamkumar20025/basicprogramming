package For_Loop_Question;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
				System.out.print("you can find the Factorial number of all nature number between 1 for n terms :");
		         int n= sc.nextInt();
		         int fact=1;
					System.out.println("Enter the yourfactorial number:");

		       for(int i=1; i<=n; i++)
		       {
				
                   fact*=i;
		       }
				System.out.println("Factorial of " + n + " is: " + fact);



	}

}