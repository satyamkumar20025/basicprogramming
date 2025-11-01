package For_Loop_Question;
import java.util.Scanner;

public class odd_number_1ton {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
				System.out.print("print all odd number from i to n :");
		         int n= sc.nextInt();
		       for( int i=1;i<=n; i++)
		       {
		    	   if(i%2==1)
		    	   {
			    	   System.out .print(i);

		    	   }
	
		       }
	}
}