package RECURSIONExample;


public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Factorial(5));

	}
	public static int Factorial(int n) {
		
		if(n==1)
		{
			return 1;
		}
		
		return n*Factorial( n-1) ;
		
	}

}
