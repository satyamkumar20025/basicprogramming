package OPERATOR_QUESTIONS;
   import java.util.Scanner;

public class leap_year {
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the check year :");
        int year = sc.nextInt();
        System.out.println((year % 4 == 0 && year % 100 != 0 )|| (year % 400 == 0 )? "Year is leap year.":"year is not leap year.");
        
        
        
        
        
   }
}
