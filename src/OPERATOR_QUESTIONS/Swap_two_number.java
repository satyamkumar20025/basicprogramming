package OPERATOR_QUESTIONS;

public class Swap_two_number {

	public static void main (String[] args)
	{
	
	int a = 5, b = 7;
	a = a ^ b;
	b = a ^ b;
	a = a ^ b;
	System.out.println("After Swap: a = " + a + ", b = " + b);

	
}

}