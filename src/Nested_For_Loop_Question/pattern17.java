package Nested_For_Loop_Question;

  import java.util.Scanner;

public class pattern17 {
	public static void main(String[] args)
	{
		  Scanner sc = new Scanner(System.in);
				System.out.print("Enter the any digit :");
		          int n = sc.nextInt();
		           int num = 1;
		        		   
		          for( int i=1;i <= n; i++)
		          {
		        	  
		        	  for(int j = 1; j<=i;j++)
		        	  {  
	        			  System.out.print(i);
	        			    
	        			  
		        	  }

		               System.out.println();

		          }
		          sc.close();
		          
	              

	};

}
