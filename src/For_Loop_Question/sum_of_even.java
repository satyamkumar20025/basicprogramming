package For_Loop_Question;

import java.util.Scanner;


public class sum_of_even {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
				System.out.print("you can find the sum of all even number between 1 for n terms :");
		         int n= sc.nextInt();
		         int sum=0;
		       for( int i=1;i<=n; i++)
		       {
		    	  sum=sum+i;
		       }
				System.out.println("Enter the your even number sun:"+sum);

	}
}














