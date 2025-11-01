package Nested_For_Loop_Question;

import java.util.Scanner;

public class questions11 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				System.out.print("Enter the any digit :");
		          int n = sc.nextInt();
		          int sum = 0;
		          for( ;n > 0; n = n / 10 )
		          {
		        	 sum = sum+n;  
		        	  
		          }
		          System.out.println(sum);
	}

}
