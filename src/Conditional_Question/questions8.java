package Conditional_Question ;

import java.util.Scanner;
 public class questions8 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the student marks grade:");
		int grade = sc.nextInt();

		if(grade <= 100 && grade >90)
		{
			System.out.println(" A+");
		}
		else if(grade <= 90 && grade >80 )
		    {
			System.out.println(" A");
		    }
		else if(grade<=80 && grade >70) {

			System.out.println("B+");
			
		}
		else if(grade<=70 && grade > 60 )
		{
			System.out.println("B");

		}
		else if(grade<=60 && grade > 50)
		{
			System.out.println("C");
		}

         else if(grade<=50 && grade > 40)
		{
			System.out.println("D");

		}
		else if(grade<=40 && grade > 33)
		{
			System.out.println("E");

		}
	
	else {
		System.out.println("fall");
	    }
         
	}
	
}
