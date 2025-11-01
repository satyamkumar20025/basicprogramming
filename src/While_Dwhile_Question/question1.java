package While_Dwhile_Question;

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the any digit :");
		int i = sc.nextInt();
		int n = 100;
		while (i <= n) {
			if (i % 5 == 0)
			{
				i++;
			  continue;	
			}

		  if (i%7 == 0)
			{

				System.out.print(i);
			}
		  i++;

		}

	};

}
