package RECURSIONExample;

import java.util.Scanner;

public class NatualNumberSum {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number");
			int n = sc.nextInt();
			System.out.println(NatualNumber(n));

		}
		public static int NatualNumber(int n) {
			
			if(n==1)
			{
				return 1;
			}
			
			return n + NatualNumber(n-1);
			
		}

	}


