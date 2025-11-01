	package For_Loop_Question;

	import java.util.Scanner;

	public class fact {
		public static void main(String[] args)
		{
			 Scanner sc = new Scanner(System.in);
					System.out.print("you can find the Factorial table of all nature number between 1 for n terms :");
			         int n= sc.nextInt();
						System.out.println("Enter the your term(n) number:");
						System.out.println("Factorial of Table 1 to :"+n);
			       for(int i=1; i<=n; i++)
			       {
			        int fact=1;

			          for(int j=1;j<=i;j++)
			          {
			        	  fact*=j;
			          }
						System.out.println("Factorial of " + i + " is: " + fact);

			       }
		}
	}


