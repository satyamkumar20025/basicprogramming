package Nested_For_Loop_Question;

import java.util.Scanner;

public class questions2 {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
				System.out.print("Enter the any digit :");
		         int n1 = sc.nextInt();
		       for( int i=1;i<=n1; i++)
		          {
		        	  for(int k = 1; k<=n1-i;k++)
		        	  {
				          System.out.print(" ");
                         }
		        	  for(int j=1;j<=2*i-1;j++)
		        	  {
		        			  System.out.print("*");
		                 }
			          System.out.println();

		          }
		          for(int i=n1-1;i>=1;i--)
		          {
		        	  for(int k=1;k<=n1-i;k++)
		        	  {
		        		  System.out.print(" ");
		        		  
		        	  }
		        	  for(int j=1;j<=2*i-1;j++)
		        	  {
		        		  System.out.print("*");
		        	  }
		        	  
		          
		          System.out.println();
		          }
	};

}

