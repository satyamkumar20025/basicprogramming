package Operator_Question;
  import java.util.Scanner;
public class find_quo_rem {
     public static void main(String[]args)
     {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("Enter the number find quotient and remainder:");
          int num1 = sc. nextInt();
    	 System.out.print("Enter the divied number quotient and remainder:");
    	  int num2 = sc . nextInt();
    	  int find1 = num1%num2;
    	  int find2 = num1/num2;
    	  System.out.println(find1);
    	  System.out.println(find2);

    	 
     }
}
