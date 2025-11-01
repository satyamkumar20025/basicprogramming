package ArrayQuestion;


	import java.util.Scanner;

	public class DuplicateElements {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input array size
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        // Input array elements
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Find duplicates
	        System.out.println("Duplicate elements:");
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.println(arr[i]);
	                    break; // Avoid printing same duplicate multiple times
	                }
	            }
	        }

	        sc.close();
	    }
	}
	

