package While_Dwhile_Question;

import java.util.Scanner;

public class question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
        int i = 1; 
		
		while (i <=n )
		{  
			int num = i*(i+1);
				System.out.print( num );
				i++;
			}
		    System.out.println();
	};

}
