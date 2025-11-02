package StringQuestion;

public class palindrome {
	
	public static void main(String[] args)
	{
		// Madam--> Madam--> Pallindrome
		String str="madam";
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{

			rev= rev+str.charAt(i);
		}
		System.out.print(rev);
		
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not a palindrome");
		}
	}
}
