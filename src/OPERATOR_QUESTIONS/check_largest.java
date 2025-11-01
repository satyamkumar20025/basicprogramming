package OPERATOR_QUESTIONS;

import java.util.Scanner;

public class check_largest {
   public static void main (String[] args)
   {
	   Scanner sc = new  Scanner(System.in);
	     System.out.print("Enter the check any number largest : ");
	    int number1=sc.nextInt();
	    int number2=sc.nextInt();
	    int largest = (number1 > number2)?number1 : number2 ;
	    System.out.println(largest);
	    
    
   }
}