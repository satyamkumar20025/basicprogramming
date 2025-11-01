package While_Dwhile_Question;

import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         System.out. print("Enter the any number");
		int n =sc.nextInt();
        String ans= "";
		
   		while (n >0 )
		{  
			int r = n%2;
			ans=r+ans;
			n/=2;
		}
		System.out.print( ans );
				
			
		    
	};

}
