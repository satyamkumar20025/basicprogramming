package For_Loop_Question;

import java.util.Scanner;

public class sum_digits {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
				System.out.print("you can find the sum of all digits between number :");
		         int i= sc.nextInt();
		         int sum=0;
		       for(; i>0; i=i/10)
		       {
		    	 int rem=i%10;
		    	 sum=sum+rem;
		       }
				System.out.println("Enter the your number sun:"+sum);

	}
}
