
package Conditional_Question ;

import java.util.Scanner;
 public class questions5  {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the check character:");
		char num = sc.next().charAt(0);
		 
		if(num == 'a'|| num == 'e'|| num == 'i'	|| num == 'o' || num == 'u')
		{
			System.out.println( num +"this is voweal :");
		}
		
		else {
			System.out.println( num+"this is consunent :");
		}; 
	}
	
}

