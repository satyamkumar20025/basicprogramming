package ArrayQuestion;


	import java.util.Scanner;

	public class EvenOddCount {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input array size
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        // Input array elements
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Count even and odd
	        int evenCount = 0;
	        int oddCount = 0;

	        for (int num : arr) {
	            if (num % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }

	        // Output results
	        System.out.println("Even numbers count: " + evenCount);
	        System.out.println("Odd numbers count: " + oddCount);

	        sc.close();
	    }
	
}
