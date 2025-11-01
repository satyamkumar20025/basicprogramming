package For_Loop_Question;

import java.util.Scanner;


public class print_1to50 {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
				System.out.print("click between 1 and 10 :");
		         int n= sc.nextInt();
		       for( int i=n;i<=50; i++)
		       {
		    	   System.out .println(i);
		       }
	}
}