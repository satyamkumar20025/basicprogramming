package While_Dwhile_Question;

import java.util.Scanner;

public class question9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the power calculator number:");
		int num = sc.nextInt();
		System.out.print("How many number do you need:");
		int n = sc.nextInt();
		int multiple = num;
		
         
		do {
			System.out.print(multiple);
				multiple *=num;
		n--;		
			}
		
		while(0!=n);
		  	};

}
