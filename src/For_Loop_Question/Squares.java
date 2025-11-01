package For_Loop_Question;

import java.util.Scanner;

public class Squares {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
				System.out.print("you can find the squares of all nature number between 1 for n terms :");
		         int n= sc.nextInt();
		         int sum=0;
		       for( int i=1;i<=n; i++)
		       {
		    	  
		       
				System.out.println("Enter the your nature number square:"+i*i);
		       }
}
}